
function coincidirContrasenia () {
    var txtpass = document.getElementById("contra1");
    var txtpass1 = document.getElementById("password");
    var avisoContrasena = document.getElementById("avisoContrasena");
    var btnEnviarDatos = document.getElementById("btnEnviarDatos");

    btnEnviarDatos.disabled = true; //inicia desactivado el btn

    if (txtpass.value.length == 0 || txtpass1.value.length == 0){
        avisoContrasena.innerHTML = ("La contraseña no coincide, por favor verifica tu contraseña.");
        avisoContrasena.style.color = "blue";
        btnEnviarDatos.disabled = true;
    } else if(txtpass.value != txtpass1.value) {
        avisoContrasena.innerHTML = ("La contraseña es errónea, no coincide.");
        avisoContrasena.style.color = "red";
        btnEnviarDatos.disabled = true;
    } else {
        avisoContrasena.innerHTML = "La contraseña coincide!";
        avisoContrasena.style.color =  "green";
        btnEnviarDatos.disabled = false;
    }
}