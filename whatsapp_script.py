# Script para enviar mensajes automaticos
# Nota: Tener Instalado "pyautogui"

import pyautogui, webbrowser
from time import sleep

webbrowser.open('https://web.whatsapp.com/send/?phone=3144210082')
sleep(10)

for i in range(1000):
    pyautogui.typewrite('Connecting your device.... ip: 192.168.24')
    pyautogui.press('enter')
