function carregaMarcas() {

	httpRequest = new XMLHttpRequest();

	if (!httpRequest) {
		console.log('Unable to create XMLHTTP instance');
		return false;
	}
	httpRequest.open('GET', 'ajax-marcas');
	httpRequest.responseType = 'json';
	httpRequest.send();
	httpRequest.onreadystatechange = function() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {

			if (httpRequest.status === 200) {

				let array = httpRequest.response;
				let select = document.getElementById("marca");
				
				for (let i = 0; i < array.length; i++) {
					let option = new Option(array[i].descricao, array[i].id);
					console.log(array[i]);
					select.appendChild(option);
				}
			} else {
				console.log('Something went wrong..!!');
			}
		}
	}
}

function carregaModelos(){
	httpRequest = new XMLHttpRequest();

	if (!httpRequest) {
		console.log('Unable to create XMLHTTP instance');
		return false;
	}
	
	let marca = document.getElementById("marca").value;
	
	httpRequest.open('GET', 'ajax-modelos?id-marca='+marca);
	httpRequest.responseType = 'json';
	httpRequest.send();
	httpRequest.onreadystatechange = function() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {

			if (httpRequest.status === 200) {

				let array = httpRequest.response;
				let select = document.getElementById("idModelo");
				select.innerHTML = "";
				for (let i = 0; i < array.length; i++) {
					let option = new Option(array[i].descricao, array[i].id);
					select.appendChild(option);
				}
			} else {
				console.log('Something went wrong..!!');
			}
		}
	}
}