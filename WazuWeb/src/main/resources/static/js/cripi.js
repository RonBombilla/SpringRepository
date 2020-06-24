

function PregController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	var token = $("meta[name='_csrf']").attr("content");

	switch (opcion) {

	case "get":
		$.ajax({
			type : "post",
			headers: {"X-CSRF-TOKEN": token},
			url : "/jugar/get",
			data : "CODP=" + $("#pregunta_id").val(),
			success : function(res) {
				if (res == null || res == "") {
					$("#msg").show();
					$("#msg").html("No se encontró pregunta");
				} else {
					$("#p-box").html(res.preg);
					ResController("list", res.codp);
				}
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda.");
			}
		});
		break;
	} 
}



function ResController(opcion, codp) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	var token = $("meta[name='_csrf']").attr("content");
	switch (opcion) {
	case "list":
		$.ajax({
			type : "post",
			headers: {"X-CSRF-TOKEN": token},
			url : "/jugar/list",
			data : "CODP=" + codp,
			success : function(res) {
				result = "";
				console.log(res);
				if (res == null || res == "") {
					$("#msg").show();
					$("#msg").html("No se encontró respuesta");
				} else {
					$.each(res, function(k, v) {
						$('#opt' + (k+1)).html(v.res);
						$('#opt' + (k+1)).val(v.resco);
						result += "<button>" + (v.res) + "</button>";
					
					});
					$("#respuestas").html(result);
				}
			},
			error : function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda.");
			}
		});
		break;
	}
}

function registrarController(){
	var token = $("meta[name='_csrf']").attr("content");
	var jobJSON = 
	{
		'nombre': $("#nombre").val(),
		//'clave': $("#correo").val(),
		'clave': $("#pass").val(),
		'claveConfirm': $("#repass").val()
	};
	
	var postData = JSON.stringify(jobJSON);
	
	$.ajax({
		type : "post",
	    headers: {"X-CSRF-TOKEN": token}, //send CSRF token in header
		url : "/registro/registrar",
		data : postData,
		contentType : "application/json; charset=utf-8",
        dataType : "json",
		success : function(res) {
			if (res == 1) {
				$("#msg").removeClass("alert-danger").addClass("alert-success");
				$("#msg").show();
				$("#msg").html("Registro ingresado correctamente.");
			} else {
				$("#msg").show();
				$("#msg").html("No se pudo ingresar el registro.");
			}
		},
		error : function() {
			$("#msg").show();
			$("#msg").html("No se pudo ingresar el registro.");
		}
	});       	
	
	
}
