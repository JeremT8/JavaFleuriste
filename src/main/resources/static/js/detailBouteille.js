$(function() {
    let searchParams = new URLSearchParams(window.location.search);
    let id = searchParams.get('id')
    if (id == null){
        window.location = "index.html";
    }
    else{
        getBouteille(id)
        getRegions()
        getCouleur()
    }
});


function getBouteille(id) {
    $.get("http://localhost:8080/bouteille/" + id, afficherBouteille);
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

function afficherBouteille(bouteille) {
    console.log(bouteille);
    $("#nom").val(bouteille.nom);
    $("#millesime").val(bouteille.millesime);
    $("#petillant").val(bouteille.petillant?'Oui':'Non');
    $("#quantite").val(bouteille.quantite);
    $("#couleur").val(bouteille.couleur.nom);
    $("#region").val(bouteille.region.nom);

}
