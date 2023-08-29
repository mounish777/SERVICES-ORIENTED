fetch('customer_data.xml')
    .then(response => response.text())
    .then(data => {
        const parser = new DOMParser();
        const xmlDoc = parser.parseFromString(data, 'text/xml');

        const users = xmlDoc.getElementsByTagName('user');

        const table = document.getElementById('userTable');

        for (let i = 0; i < users.length; i++) {
            const user = users[i];
            const name = user.querySelector('name').textContent;
            const age = user.querySelector('age').textContent;
            const gender = user.querySelector('gender').textContent;
            const mail = user.querySelector('mail').textContent;

            const row = table.insertRow();
            const nameCell = row.insertCell(0);
            const ageCell = row.insertCell(1);
            const genderCell = row.insertCell(2);
            const mailCell = row.insertCell(3);

            nameCell.innerHTML = name;
            ageCell.innerHTML = age;
            genderCell.innerHTML = gender;
            mailCell.innerHTML = mail;
        }
    })
    .catch(error => console.error('Error fetching user data:', error));
    
    setInterval(d,1000);
    function d(){
        let a = new Date();
    document.getElementById("demo").innerHTML ="Records on date:- " +a.getMonth()+ " "+ a.getHours()+":"+a.getMinutes()+":"+a.getSeconds();
    }