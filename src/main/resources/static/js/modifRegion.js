$(function() {
    getRegion(id);
    $("#bEnvoyer").on ("click", envoyer);
});


function getRegion(id) {
    $.get("http://localhost:8080/region/" + id, afficherRegion);
}


function afficherRegion(region) {
    console.log(region);
    $("#id").val(region.id);
    $("#nom").val(region.nom);

}


function envoyer() {
    var data = {
        nom: $("#nom").val(),

    }

    $.ajax({
        type: 'put',
        url: 'http://localhost:8080/region/update',
        data: JSON.stringify(data),
        contentType: "application/json;charset=utf-8",
        success: function() {
            window.location = "region.html";
        }
    })
        .fail(function() {
            $("#errorRegion").css("display", "block");
            $("#errorRegion").html("Une erreur est survenue lors de l'ajout");
        })
}


