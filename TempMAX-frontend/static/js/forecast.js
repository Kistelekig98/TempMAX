const uri = "http://localhost:8080";

$(document).ready(function () {
    listAllTemps();
    listAllForecasts();
});

function listAllTemps() {
	$.ajax({
		type: 'GET',
		url: uri + "/temps",
		cache: false,
		success: function (list) {
			$.each(list, function (i, item) {
				$('#tempList').append(
					"<li class='list-group-item'> <div class='row'>" +
						"<div class='col'>" + item.place + "</div>" +
						"<div class='col'>" + item.temperature + " ºC" + "</div>" +	
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}

function listAllForecasts() {
	$('.forecastListItem').remove();

	$.ajax({
		type: 'GET',
		url: uri + "/forecast",
		cache: false,
		success: function (list) {
			$.each(list, function (i, item) {
				$('#forecastList').append(
					"<li class='list-group-item forecastListItem'> <div class='row'>" +
						"<div class='col'>" + item.creationDate + "</div>" +
						"<div class='col'>" + item.title + " ºC" + "</div>" +	
						"<div class='col-lg-3'>" + item.details + "</div>" +
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}
