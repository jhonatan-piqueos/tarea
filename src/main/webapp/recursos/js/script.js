var cod = document.getElementById("codigo");
var nom = document.getElementById("nombre");
var ap = document.getElementById("ap");
var am = document.getElementById("am");
var i = 0;
var filita = "";
var estado = 0;
function registrar(){  
   
    if(estado==0){
        alert("save");
    var table = document.getElementById("table");
    var  tbody= document.getElementById("tbd");
    var fila = document.createElement("tr");
    i=i+1;
    //celda del
    var idd = document.createElement("td");
    idd.innerHTML=i;
    //celda del codigo
    var celda_codigo = document.createElement("td");
    celda_codigo.innerHTML=cod.value;
     //celda del nombres
     var celda_nombre = document.createElement("td");
     celda_nombre.innerHTML=nom.value;
      //celda del apellido
     var celda_appatern = document.createElement("td");
     celda_appatern.innerHTML=ap.value;
     //celda del apellido
     var celda_apmatern = document.createElement("td");
     celda_apmatern.innerHTML=am.value;

    fila.appendChild(idd);
    fila.appendChild(celda_codigo);
    fila.appendChild(celda_nombre);
    fila.appendChild(celda_appatern);
    fila.appendChild(celda_apmatern);
    //Agregar fila al tbody
    tbody.appendChild(fila);
    //agregar tbody a la tabla
    table.appendChild(tbody);
    limpiar();
    }
    else{
        alert("editar");
        filita.cells[0].innerHTML = cod.value;
        filita.cells[1].innerHTML = nomb.value;
        filita = "";
        limpiar();
        estado = 0;
    }
 function limpiar(){
    cod.value = "";
	nom.value= "";
    ap.value = "";
    am.value = "";
    nom.focus();
    
}

}