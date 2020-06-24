var currentQuestion = 0;
var score = 0;
var totQuestions = 10;

var container = document.getElementById('contenedr');
var questionEl = document.getElementById('question');
var opt1 = document.getElementById('opt1')
var opt2 = document.getElementById('opt2')
var opt3 = document.getElementById('opt3')
var opt4 = document.getElementById('opt4')
var nextButton = document.getElementById('nextButton');
var resultCont = document.getElementById('result');

function loadQuestion (){
	var q = PregController('get');
}

function loadNextQuestion () {
	var selectedOption = document.querySelector('input[type=radio]:checked');
	if(!selectedOption){

		alert('Por favor selecciona una respuesta!');
		return;
	}
	var answer = $("#opt"+ selectedOption.value).val();
	if(answer=="true"){
		score +=10;
		console.log(score);
	}
	selectedOption.checked = false;
	currentQuestion++;
	if(currentQuestion == totQuestions - 1){
		nextButton.textContent = 'Terminar';
	}
	if(currentQuestion == totQuestions){
		container.style.display = 'none';
		resultCont.style.display = '';
		if (score <= 50) {
			resultCont.textContent = "Tu puntuación pk: " + score;

		}
		resultCont.textContent = "Tu puntuación: " + score;
	}
	loadQuestion(currentQuestion);

}
loadQuestion(currentQuestion);