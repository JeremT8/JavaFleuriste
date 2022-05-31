$(function() {
    let searchParams = new URLSearchParams(window.location.search);
    let id = searchParams.get('id')
    if (id == null){
        window.location = "index.html";
    }
    else{
        getCouleur(id)
    }
});


function getCouleur(id) {
    $.get("http://localhost:8080/couleur/" + id, afficherCouleur);
}



function afficherCouleur(couleur) {
    console.log(couleur);
    $("#nom").val(couleur.nom);


}
