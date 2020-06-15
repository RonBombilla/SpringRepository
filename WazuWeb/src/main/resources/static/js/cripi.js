

function PregController(opcion) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");

	switch (opcion) {

	case "get":
		$.ajax({
			type : "post",
			url : "/jugar/get",
			data : "CODP=" + $("#pregunta_id").val(),
			success : function(res) {
				if (res == null || res == "") {
					$("#msg").show();
					$("#msg").html("No se encontró pregunta");
				} else {
					$("#question").html(res.preg);
					ResController("list", res.codp);
					console.log(res.preg);
				}
			},
			error : function() {
				$("#msg").show();
				;("#msg").html("Error en busqueda.");
			}
		});
		break;
	} 
}



function ResController(opcion, codp) {
	$("#msg").hide();
	$("#msg").removeClass("alert-success").addClass("alert-danger");
	switch (opcion) {
	case "list":
		$.ajax({
			type : "post",
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
