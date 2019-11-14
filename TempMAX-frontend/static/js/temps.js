const uri = "http://localhost:8080/temps";
//const uri = "https://jsonplaceholder.typicode.com/users";

$(document).ready(function () {
    listAllTemps();
});

function listAllTemps() {
	$.ajax({
		type: 'GET',
		url: uri,
		cache: false,
		success: function (list) {
			$.each(list, function (i, item) {
				$('#tempList').append(
					"<li class='list-group-item'> <div class='row'>" +
						"<div class='col'>" + item.place + "</div>" +	// item.place
						"<div class='col'>" + item.temperature + "</div>" +		// item.temperature
					"</div> </li>"
				);
			});
		},
		error: function (jqXHR, status, error) {
			alert("jqXHR: " + jqXHR.status + "\n\nstatus: " + status + "\n\nerror: " + error);
		}
	});
}
