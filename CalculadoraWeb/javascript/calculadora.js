const display = document.querySelector("#display")
const buttons = document.querySelectorAll("button")
const puntoDecimal = document.getElementById(".")

const botonIgual = document.getElementById("botonIgual")
const botonSumar = document.getElementById(" + ")
const botonRestar = document.getElementById(" - ")
const botonMultiplicar = document.getElementById(" * ")
const botonDividir = document.getElementById(" / ")
const botonBorrar = document.getElementById("botonBorrar")
const botonCE = document.getElementById("botonCE")
const botonC = document.getElementById("botonC")

buttons.forEach((boton) => {
    eventoClick()
    boton.addEventListener("click", () => {
        if (boton.id === "botonIgual") {
            display.value = eval(display.value);

        } else if (boton.id === "botonC" || boton.id === "botonCE") {
            display.value = "";

        } else if (boton.id === "botonBorrar") {
            display.value = display.value.slice(0, -1);

        }else {
            display.value += boton.id
        }
    }) 
}) 

function eventoClick() {
    puntoDecimal.addEventListener("click", offPunto)
    botonIgual.addEventListener("click", onPunto)
    botonSumar.addEventListener("click", onPunto)
    botonRestar.addEventListener("click", onPunto)
    botonMultiplicar.addEventListener("click", onPunto)
    botonDividir.addEventListener("click", onPunto)
    botonC.addEventListener("click", onPunto)
    botonBorrar.addEventListener("click", onPunto)
    botonCE.addEventListener("click", onPunto)
}

function offPunto() {
    puntoDecimal.disabled = true
}

function onPunto() {
    puntoDecimal.disabled = false
}

