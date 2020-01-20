let xhr = new XMLHttpRequest();

window.onload = () =>
{
	document.getElementById("calculateSalary").addEventListener("click", calculateSalary);
	document.getElementById("calculateSalary2").addEventListener("click", calculateSalary2);
}

function calculateSalary()
{
	let txtName = document.getElementById("txtName").value;
	let txtSalary = document.getElementById("txtSalary").value;
	let url = `CalculateSalaryServlet?txtName=${txtName}&txtSalary=${txtSalary}`;
	
	xhr.onload = functionCallBack;
	xhr.open("GET", url);
	xhr.send(null);
}

function functionCallBack()
{
	document.getElementById("salaryCalculated").innerHTML = xhr.response;
}

function calculateSalary2()
{
	let txtName = document.getElementById("txtName2").value;
	let txtSalary = document.getElementById("txtSalary2").value;
	let url = "CalculateSalaryServlet2";
	let myForm = new FormData();
	myForm.append("txtName", txtName);
	myForm.append("txtSalary", txtSalary);
	xhr.onload = functionCallBack2;
	xhr.open("POST", url);
	xhr.send(myForm);
}

function functionCallBack2()
{
	document.getElementById("salaryCalculated2").innerHTML = xhr.response;
}
