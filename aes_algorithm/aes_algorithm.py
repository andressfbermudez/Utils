#!/usr/bin/venv python3

import sys
import base64
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
from Crypto.Util.Padding import pad, unpad

class AESCipher:
    def __init__(self, key):
        self.key = key.ljust(32)[:32].encode()  # Clave de 32 bytes para AES-256

    def encrypt(self, text):
        iv = get_random_bytes(16)
        cipher = AES.new(self.key, AES.MODE_CBC, iv)
        encryption_text = cipher.encrypt(pad(text.encode(), AES.block_size))
        return base64.b64encode(iv + encryption_text).decode()

    def decrypt(self, encryption_b64):
        data = base64.b64decode(encryption_b64)
        iv = data[:16]
        texto_cifrado = data[16:]
        cipher = AES.new(self.key, AES.MODE_CBC, iv)
        decoded_text = unpad(cipher.decrypt(texto_cifrado), AES.block_size)
        return decoded_text.decode()

def encript_message():
    secret = input("\nIngresa tu clave secreta: ")
    aes = AESCipher(secret)

    message = input("Ingresa el mensaje a encriptar: ")
    encripted_message = aes.encrypt(message)
    print("\nMensaje Encriptado:", encripted_message)

def decript_message():
    secret = input("\nIngresa tu clave secreta: ")
    aes = AESCipher(secret)

    encripted_message = input("Ingresa el mensaje a desencriptar: ")
    try:
        decrypted_message = aes.decrypt(encripted_message)
        print("Mensaje desencriptado:", decrypted_message)
    except (ValueError, KeyError, Exception) as e:
        print("\nError: Verifica si tu clave secreta y el mensaje son correctos.")

def start_app():
    while True:
        print("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::")
        print("1. Encriptar un mensaje.")
        print("2. Desencriptar un mensaje.")
        print("0. Salir.")

        try:
            selection_user = int(input("\nTu opcion: "))
            if selection_user == 0:
                sys.exit()
            elif selection_user == 1:
                encript_message()
            elif selection_user == 2:
                decript_message()
            else:
                print("\nError: El valor ingresado no es valido.")
                continue
        except ValueError:
            print("\nError: El valor ingresado no es valido.")
            continue

# Iniciar la aplicacion
start_app()
