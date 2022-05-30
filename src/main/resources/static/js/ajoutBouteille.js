$(function() {
    getRegions();
    getCouleur();
    $("#bEnvoyer").on ("click", envoyer);
});

function envoyer() {

    var data = {
        nom: $("#nom").val(),
        millesime: $("#millesime").val(),
        petillant: $("#petillant").val(),
        quantite: $("#quantite").val(),
        couleur: {
            id: $("#couleur").val()
        },
        region: {
            id: $("#region").val()
        },
    }

    $.ajax({
        type: 'post',
        url: 'http://localhost:8080/bouteille/add',
        data: JSON.stringify(data),
        contentType: "application/json;charset=utf-8",
        success: function() {
            window.location = "bouteille.html";
        }
    })
        .fail(function() {
            $("#errorBouteille").css("display", "block");
            $("#errorBouteille").html("Une erreur est survenue lors de l'ajout");
        })
}


function getRegions() {
    $("#errorBouteille").css("display", "none");

    $.get("http://localhost:8080/region", function(regions){

        var data = "";
        regions.forEach(function(r){
            data += "<option value="+r.id +">" + r.nom + "</option>";
        });

        $("#region").html(data);

    });
}

function getCouleur() {
    $("#errorBouteille").css("display", "none");

    $.get("http://localhost:8080/couleur", function(couleur){

        var data = "";
        couleur.forEach(function(c){
            data += "<option value="+c.id +">" + c.nom + "</option>";
        });

        $("#couleur").html(data);

    });
}