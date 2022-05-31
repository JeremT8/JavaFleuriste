$(document).ready(function () {
    $("#myTable").DataTable();
})

$(function() {
    getCouleur();
    $("#bEnvoyer").on("click", envoyer);
});

function envoyer() {

    var data = {
        nom: $("#nom").val(),
    }

    $.ajax({
        type: 'post',
        url: 'http://localhost:8080/couleur/add',
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

function getCouleur() {
    $.get("http://localhost:8080/couleur", afficherCouleurs);
}


function afficherCouleurs(couleur) {
    var data = "";
    $("#nbCouleur").html(couleur.length);
    couleur.forEach(function (c) {
        var tr = "<tr>";
        tr += "<td><button onclick='afficheCouleur(" + c.id + ")' type='button' class='btn btn-link'>" + c.id + "</button></td>";
        tr += "<td>" + c.nom + "</td>";

        tr += "<td class='centre'><button onclick='modifCouleur(" + c.id + ")' type='button' class='glyphicon glyphicon-edit vert'></button></td>";
        tr += "<td class='centre'><button onclick='suppCouleur(" + c.id + ")' type='button' class='glyphicon glyphicon-remove rouge'></button></td>";

        tr += "</tr>";

        data += tr;
    })
    $("#tbodyliste").html(data);

}

function afficheCouleur(id){
    window.location = "detailCouleur.html?id=" + id;
}

function modifCouleur(id){
    window.location = "modifCouleur.html?id=" + id;
}



function suppCouleur(id){
    $.ajax({
        type : 'delete',
        url : 'http://localhost:8080/couleur/' + id,
        success : function(){
            getCouleur();
        }
    })
        .fail(function(){
            $("#errorCouleur").css("display", "block");
            $("#errorCouleur").html("Une erreur est survenue lors de la suppression");
        })
}