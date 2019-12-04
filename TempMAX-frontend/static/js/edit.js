const uri = "http://localhost:8080";

$(document).ready(function () {
    listAllTemps();

    $('#addButton').click(function () {
    	//alert($('#inputTitle').val() + "\n" + $('#textareaText').val());
    	addForecast($('#inputTitle').val(), $('#textareaText').val());
    });
});

function listAllTemps() {
	$('.tempListItem').remove();

	$.ajax({
		type: 'GET',
		url: uri + "/temps",
		cache: false,
		success: function (list) {
			$.each(list, function (i, item) {
				$('#tempList').append(
					"<li class='list-group-item tempListItem'> <div class='row'>" +
						"<div class='col'>" + item.place + "</div>" +
						"<div class='col'>" + item.temperature + " ºC" + "</div>" +	
						"<div class='col-lg-3'>" + item.created_at + "</div>" +
						"<div class='col'>" + item.lat + ", " + item.lng + "</div>" +
						"<div class='col'>" + item.humidity + "</div>" +
						"<div class='col'>" + item.windDirection + " fok" + "</div>" +
						"<div class='col'>" + item.windSpeed +  " km/h" + "</div>" +
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}

function addForecast(title, text) {
    var forecastPost = {
        Title: title,
        Text: text
    };

    $.ajax({
        type: "POST",
        url: uri + "/forecasts",
        contentType: "application/json",
        data: JSON.stringify(forecastPost),
        error: function () {
            alert("Az adatok küldése sikertelen");
        }
    });
}
