let formulario = document.getElementById("formulario_evento");
let nombreEvento = formulario.getElementById("nombre_evento").value;
let descripcionEvento = document.getElementById("descripcion_evento").value;
let fechaInicioEvento = document.getElementById("fecha_evento").value;
let horaInicioEvento = document.getElementById("horaI_evento").value;
let horaFinEvento = document.getElementById("horaF_evento").value;


formulario.addEventListener("submit", (e) => {

    e.preventDefault();
    let evento = {
        nombre: nombreEvento,
        descripcion: descripcionEvento,
        fechaI: fechaInicioEvento,
        horaI: horaInicioEvento,
        horaF: horaFinEvento
    }

    console.log(evento)
});

