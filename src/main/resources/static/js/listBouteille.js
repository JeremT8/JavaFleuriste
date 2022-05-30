// console.log("coucou");

$(function() {
    getBouteille();
});



function getBouteille() {
    $.get("http://localhost:8080/bouteille", afficherBouteilles);
}

function afficherBouteilles(bouteille) {
    var data = "";
    $("#nbFilms").html(bouteille.length);
    bouteille.forEach(function(b) {
        var tr = "<tr>";
        tr += "<td><button onclick='afficheBouteille(" + b.id + ")' type='button' class='btn btn-link'>" + b.nom + "</button></td>";
        tr += "<td>" + b.millesime + "</td>";
        tr += "<td>" + (b.petillant?"Oui":"Non") + "</td>";
        tr += "<td>" + b.quantite + "</td>";
        tr += "<td>" + b.couleur.nom + "</td>";
        tr += "<td>" + b.region.nom + "</td>";

        tr += "<td class='centre'><button onclick='modifBouteille(" + b.id + ")' type='button' class='glyphicon glyphicon-edit vert'></button></td>";
        tr += "<td class='centre'><button onclick='suppBouteille(" + b.id + ")' type='button' class='glyphicon glyphicon-remove rouge'></button></td>";

        tr += "</tr>";

        data += tr;
    })
    $("#tbodyliste").html(data);
}


function afficheBouteille(id){
    window.location = "detailbouteille.html?id=" + id;
}

function modifBouteille(id){
    window.location = "modifBouteille.html?id=" + id;
}

//