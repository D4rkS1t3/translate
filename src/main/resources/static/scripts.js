document.addEventListener('DOMContentLoaded', function () {
    var form = document.querySelector('form');
    var translationResult = document.getElementById('translationResult');
    var translatedText = document.getElementById('translatedText');

    form.addEventListener('submit', function (event) {
        event.preventDefault();

        var formData = new FormData(form);

        fetch('/translate/submit', {
            method: 'POST',
            body: formData
        })
        .then(response => response.json())
        .then(data => {
            translationResult.classList.remove('hidden');
            translatedText.textContent = data.translatedText;
        })
        .catch(error => console.error('Error:', error));
    });
});
