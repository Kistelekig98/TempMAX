const uri = "http://localhost:8080/temps";
//const uri = "https://jsonplaceholder.typicode.com/users";

$(document).ready(function () {
    listAllTemps();

    $('#addButton').click(function () {
    	alert($('#inputTitle').val() + "\n" + $('#textareaText').val());
    });
});

function listAllTemps() {
	$('.tempListItem').remove();

	$.ajax({
		type: 'GET',
		url: uri,
		cache: false,
		success: function (list) {
			$.each(list, function (i, item) {
				$('#tempList').append(
					"<li class='list-group-item tempListItem'> <div class='row'>" +
						"<div class='col'>" + item.place + "</div>" +
						"<div class='col'>" + item.temperature + "</div>" +	
						"<div class='col-lg-3'>" + item.created_at + "</div>" +
						"<div class='col'>" + item.lat + ", " + item.lng + "</div>" +
						"<div class='col'>" + item.humidity +  "</div>" +
						"<div class='col'>" + item.windDirection + "</div>" +
						"<div class='col'>" + item.windSpeed + "</div>" +
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}
