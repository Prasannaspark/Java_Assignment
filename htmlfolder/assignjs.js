document.getElementById('addCustomer').addEventListener('click', function() {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const contact = document.getElementById('contact').value;
    const accountType = document.getElementById('accountType').value;
 
    let isValid = true;
 
    // Name validation
    if (!/^[a-zA-Z\s]+$/.test(name)) {
        document.getElementById('nameError').textContent = "Please enter only alphabets";
        document.getElementById('nameError').style.display = "block";
        isValid = false;
    } else {
        document.getElementById('nameError').style.display = "none";
    }
 
    // Email validation
    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        document.getElementById('emailError').textContent = "Please enter a valid email";
        document.getElementById('emailError').style.display = "block";
        isValid = false;
    } else {
        document.getElementById('emailError').style.display = "none";
    }
 
    // Contact validation
    if (!/^[789]\d{9}$/.test(contact)) {
        document.getElementById('contactError').textContent = "Please enter a valid 10-digit contact number starting with 7, 8, or 9";
        document.getElementById('contactError').style.display = "block";
        isValid = false;
    } else {
        document.getElementById('contactError').style.display = "none";
    }
 
    // Account type validation
    if (accountType === "") {
        document.getElementById('accountTypeError').textContent = "Please select an account type";
        document.getElementById('accountTypeError').style.display = "block";
        isValid = false;
    } else {
        document.getElementById('accountTypeError').style.display = "none";
    }
 
    if (isValid) {
        const customer = {
            name: name,
            email: email,
            contact: contact,
            accountType: accountType
        };
 
        addCustomerToTable(customer);
        document.getElementById('customerForm').reset();
    }
});
 
function addCustomerToTable(customer) {
    const tableBody = document.getElementById('customerTable').querySelector('tbody');
    const row = document.createElement('tr');
 
    row.innerHTML = `
        <td>${customer.name}</td>
        <td>${customer.email}</td>
        <td>${customer.contact}</td>
        <td>${customer.accountType}</td>
    `;
 
    tableBody.appendChild(row);
}
 