window.onload = function() {
	console.log("in load function");
	loadLandingView();
}

function loadLandingView() {
	console.log("in loadlandView function");
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			$('#view').html(xhr.responseText);
		}
	}
	xhr.open("GET", "login.View");
	xhr.send();
}
