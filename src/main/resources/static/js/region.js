$(document).ready(function () {
    $("#myTable").DataTable();
})

$(function() {
    getRegion();
});



function getRegion() {
    $.get("http://localhost:8080/region", afficherRegions);
}


function afficherRegions(region) {
    var data = "";
    $("#nbRegion").html(region.length);
    region.forEach(function (r) {
        var tr = "<tr>";
        tr += "<td><button onclick='afficheRegion(" + r.id + ")' type='button' class='btn btn-link'>" + r.id + "</button></td>";
        tr += "<td>" + r.nom + "</td>";

        tr += "<td class='centre'><button onclick='modifRegion(" + r.id + ")' type='button' class='glyphicon glyphicon-edit vert'></button></td>";
        tr += "<td class='centre'><button onclick='suppRegion(" + r.id + ")' type='button' class='glyphicon glyphicon-remove rouge'></button></td>";

        tr += "</tr>";

        data += tr;
    })
    $("#tbodyliste").html(data);

}


function afficheRegion(id){
    window.location = "detailRegion.html?id=" + id;
}

function modifRegion(id){
    window.location = "modifRegion.html?id=" + id;
}




function suppRegion(id){
    $.ajax({
        type : 'delete',
        url : 'http://localhost:8080/region/' + id,
        success : function(){
            getRegion();
        }
    })
        .fail(function(){
            $("#errorRegion").css("display", "block");
            $("#errorRegion").html("Une erreur est survenue lors de la suppression");
        })
}