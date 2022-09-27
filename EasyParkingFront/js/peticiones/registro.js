
 var datoVehiculo = null 
 



function guardarProducto() {
    let hora_ingreso = document.getElementById("regfecha").value;
    let placa = document.getElementById("regentrada").value;
    let tipo_Vehiculo = document.getElementById("tipovehiculo").value;
    
    let data = {
         "placa":placa,
    "hora_ingreso": hora_ingreso,
    "tipo_Vehiculo": {
        "idtipo_de_vehiculo": tipo_Vehiculo
    }
};
console.log(data);
let peticion=sendRequest('registro','POST',data);
peticion.onload=function(){
    alert("Guardo Exitosamente");
}
peticion.onerror=function(){
    alert("you fail");
}


}


function guardarSalida(){
    let idregistro = document.getElementById("idregistro").value;
    let hora_salida = document.getElementById("fechasalida").value;
    let hora_ingreso = document.getElementById("regfecha").value;
    let placa = document.getElementById("bplaca").value;
    /*let tipo_Vehiculo = document.getElementById("regtipovehiculo").value;*/
    let valorfactura = document.getElementById("vlrfactura").value

    

    let data = {
        
            "idregistro": idregistro,
            "placa": placa, 
            "hora_ingreso": hora_ingreso,
            "hora_salida": hora_salida,
            "tipo_Vehiculo": {
                "idtipo_de_vehiculo": datoVehiculo.tipo_Vehiculo.idtipo_de_vehiculo    
            },
            "fechafactura": hora_salida,
            "valorfactura": valorfactura,
        
   
};
console.log(data);
let peticion=sendRequest('registro','PUT',data);
console.log("prueba",datoVehiculo);
peticion.onload=function(){
   alert("Guardo Exitosamente");
}
peticion.onerror=function(){
   alert("you fail");
}




}


function mostrarRegistro(){

    let idregistro = document.getElementById("idregistro");
    let hora_ingreso = document.getElementById("regfecha");
    let placa = document.getElementById("bplaca").value;
    let tipo_Vehiculo = document.getElementById("regtipovehiculo");
    let data = {

            "idregistro":idregistro,
            "placa": placa,
            "hora_ingreso": hora_ingreso,
            
            "tipo_Vehiculo": {
                "idtipo_de_vehiculo": tipo_Vehiculo,
               
            },
           
        
   };
    
    let peticion=sendRequest('registro/buscarvehiculo?placa='+placa,'GET','');
    peticion.onload=function(){
      
        console.log(peticion.response);
        if(peticion.response.length>0){
        let datos=peticion.response[0];
        datoVehiculo=datos;
        hora_ingreso.value = datos.hora_ingreso;
        tipo_Vehiculo.value=datos.tipo_Vehiculo.descripcion;
        idregistro.value = datos.idregistro;
        var today = new Date(); 
        var now = today.toISOString();
        document.getElementById("fechasalida").value = now;
        }else{
            document.getElementById("fechasalida").value="Placa no encontrada";
            document.getElementById("regtipovehiculo").value="";
        }
               


    }

   


}



function cargarTipos(){
    let tipo_Vehiculo = document.getElementById("tipovehiculo");
    let peticion=sendRequest('tipoVehiculo/listaTipoVehiculo','GET','');
    peticion.onload=function(){
            let datos=peticion.response;
            datos.forEach(tipo=>{
                let opcion=document.createElement("option");
                opcion.text=tipo.descripcion;
                opcion.value=tipo.idtipo_de_vehiculo;
                tipo_Vehiculo.add(opcion);
            })
    }
}