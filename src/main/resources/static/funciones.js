// confirma antes de eliminar los servicios
function confirmarEliminacion() {
    return confirm("¿Desea eliminar este servicio?");
}

// valida crear y editar
function validarFormulario() {

    let descripcion = document.getElementById("descripcion").value.trim();
    let problema = document.getElementById("problema").value.trim();
    let diagnostico = document.getElementById("diagnostico").value.trim();

    if (descripcion.length < 5) {
        alert("La descripción debe tener al menos 5 caracteres.");
        return false;
    }

    if (descripcion.length > 50) {
        alert("La descripción no puede superar los 50 caracteres.");
        return false;
    }

    if (problema.length < 5) {
        alert("El problema debe tener al menos 5 caracteres.");
        return false;
    }

    if (problema.length > 100) {
        alert("El problema no puede superar los 100 caracteres.");
        return false;
    }

    if (diagnostico.length < 5) {
        alert("El diagnóstico debe tener al menos 5 caracteres.");
        return false;
    }

    if (diagnostico.length > 100) {
        alert("El diagnóstico no puede superar los 100 caracteres.");
        return false;
    }

    return true;
}