document.addEventListener('DOMContentLoaded', function () {
    var form = document.querySelector('form');
    var inputText = document.getElementById('translatedText');

    form.addEventListener('submit', function (event) {
        event.preventDefault();

        var formData = new FormData(form);

        fetch('/translate', {
            method: 'POST',
            body: formData
        })
        .then(response => response.text()) // Odczytujemy odpowiedź jako tekst
        .then(data => {
            inputText.value = data; // Aktualizacja zawartości pola tekstowego
            autoResize(inputText);
        })
        .catch(error => console.error('Error:', error));
    });
});
