//Get the input field
var titulo = document.querySelector("#titulo");
var cdBarras = document.querySelector("#cdBarras");

//Execute a function when the user releases a key on the keyboard
cdBarras.addEventListener("keyup", function(event) {
	if (event.keyCode === 13) {
		//Cancel the default action, if needed
		//event.preventDefault();
		cadastrar();
	}
});

function cadastrar() {
	let dvd = {
		"titulo": titulo.value,
		"codBarras": cdBarras.value
	};
	saveDVD(dvd);
}

function saveDVD(dvd) {
	let xhr = new XMLHttpRequest();
	let json = JSON.stringify(dvd);
	xhr.open("POST", 'dvd/cadastrar');
	xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
	xhr.send(json);	 
	xhr.onload = function() {
		if (xhr.status != 200) {
			alert(`Error ${xhr.status}: ${xhr.statusText}`);
		} else {
			let res = JSON.parse(xhr.response);
			console.log(`${res.titulo} cadastrado com sucesso! ID ${res.id}`);
			limpaCampos();
		}
	};
	xhr.onerror = function() {
		alert("Request failed");
	};
}
 
function limpaCampos() {
	titulo.value = '';
	cdBarras.value = '';
	titulo.focus();
}