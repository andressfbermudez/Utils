import pyautogui
import webbrowser
from time import sleep
import os

# Ruta del archivo en el HOME
file_path = os.path.expanduser('~/message.txt')

# Número de WhatsApp (sin '+')
numero = '3143452305'

# Abrir WhatsApp Web con número específico
webbrowser.open(f'https://web.whatsapp.com/send/?phone={numero}')
sleep(15)  # Esperar a que cargue la página (ajustar si es necesario)

# Leer y enviar línea por línea
with open(file_path, 'r', encoding='utf-8') as f:
    for linea in f:
        texto = linea.strip()
        if texto:
            pyautogui.typewrite(texto)
            pyautogui.press('enter')
            sleep(1)  # Pequeña pausa entre mensajes
