@echo off
chcp 65001 >nul
setlocal

echo ============================================================
echo  Eliminando impresoras de red existentes...
echo ============================================================

powershell -NoProfile -ExecutionPolicy Bypass -Command "Get-Printer | Where-Object { $_.ComputerName -ne $null } | ForEach-Object { try { Remove-Printer -Name $_.Name -ErrorAction Stop; Write-Output \"Impresora eliminada: $($_.Name)\" } catch { Write-Output \"Error al eliminar: $($_.Name) - $($_.Exception.Message)\" } }"

echo.
echo ============================================================
echo  Conectando a la nueva impresora de red...
echo ============================================================

powershell -NoProfile -ExecutionPolicy Bypass -Command "try { Add-Printer -ConnectionName '\\192.168.3.132\imp_caja' -ErrorAction Stop; Write-Output \"Conexión exitosa a la impresora: \\192.168.3.132\imp_caja\" } catch { Write-Output \"No se pudo conectar a la impresora: $($_.Exception.Message)\" }"

echo.
echo ============================================================
echo  Estableciendo como impresora predeterminada...
echo ============================================================

powershell -NoProfile -ExecutionPolicy Bypass -Command "try { (Get-WmiObject -Query 'SELECT * FROM Win32_Printer WHERE Name=\"imp_caja\"').SetDefaultPrinter() | Out-Null; Write-Output \"Impresora predeterminada establecida: imp_caja\" } catch { Write-Output \"No se pudo establecer la impresora predeterminada: $($_.Exception.Message)\" }"

echo.
echo ============================================================
echo  ¡Proceso completado!
echo ============================================================

pause
endlocal
