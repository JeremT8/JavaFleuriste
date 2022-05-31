$(function() {
    getCouleur(id);
    $("#bEnvoyer").on ("click", envoyer);
});


function getCouleur(id) {
    $.get("http://localhost:8080/couleur/" + id, afficherCouleur);
}


function afficherCouleur(couleur) {
    console.log(couleur);
    $("#id").val(couleur.id);
    $("#nom").val(couleur.nom);

}


function envoyer() {
    var data = {
        nom: $("#nom").val(),

    }

    $.ajax({
        type: 'put',
        url: 'http://localhost:8080/couleur/update',
        data: JSON.stringify(data),
        contentType: "application/json;charset=utf-8",
        success: function() {
            window.location = "couleur.html";
        }
    })
        .fail(function() {
            $("#errorCouleur").css("display", "block");
            $("#errorCouleur").html("Une erreur est survenue lors de l'ajout");
        })
}


