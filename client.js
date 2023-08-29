document.getElementById("submitBtn").addEventListener("click", function() {
    const name = document.getElementById("name").value;
    const age = document.getElementById("age").value;
    const gender = document.getElementById("gender").value;
    const mail = document.getElementById("mail").value;

    const xmlData = `<user>
                        <name>${name}</name>
                        <age>${age}</age>
                        <gender>${gender}</gender>
                        <mail>${mail}</mail>
                    </user>&`;  // Add '&' to separate entries

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:3000/submit", true);
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send(xmlData);

    alert("user information saved on server!");
});
