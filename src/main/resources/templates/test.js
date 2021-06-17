async function  getUser() {
    let response = await fetch('/api/users/add-user',{
        method: 'GET'
    });
    return response.json();
}

function reloadTable() {
    return getUser().then((user) => {
        console.log(user);

        let table = document.getElementById("user_table");

        table.innerHTML = '';

        let row = table.insertRow(0);
        row.innerHTML = '<tr>\n' +
            '        <th>ID</th>\n' +
            '        <th>Name</th>\n' +
            '        <th>Password</th>\n' +
            '        <th>age</th>\n' +
            '    </tr>';

        row = table.insertRow(1);


        row.insertCell(0).innerText = user.id;
        row.insertCell(1).innerText = user.name;
        row.insertCell(2).innerText = user.password;
        row.insertCell(3).innerText = user.age;
    });
}

reloadTable();