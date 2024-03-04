let API_URL = "http://localhost:9999";
function onSignUp(event){  
    event.preventDefault()

    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;

    let xml = new XMLHttpRequest();

    let signUpObject = {}
    signUpObject.username = username;
    signUpObject.password = password;

    let requset = JSON.stringify(signUpObject);
    xml.onload = function(){
        let response = this.response;
        let user = JSON.parse(response)
        if (user.username == requset.username) {
            alert("Bu istifadəçi adı sistemdə var")
        }else{
           alert("success") 
        }
        
    }

    xml.open("POST",API_URL+"/users",true);
    xml.setRequestHeader('Content-type', 'application/json');
    xml.send(requset);
}

function onLoginPage(){
    window.location.href='login.html'
}