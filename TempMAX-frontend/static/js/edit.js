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
						"<div class='col'>" + "</div>" +
						"<div class='col'>" + "</div>" +
						"<div class='col'>" + "</div>" +
						"<div class='col'>" + "</div>" +
						"<div class='col'>" + "</div>" +
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}
