$(function() {
    let searchParams = new URLSearchParams(window.location.search);
    let id = searchParams.get('id')
    if (id == null){
        window.location = "index.html";
    }
    else{
        getRegion(id)
    }
});


function getRegion(id) {
    $.get("http://localhost:8080/region/" + id, afficherRegions());
}



function afficherRegions(region) {
    console.log(region);
    $("#nom").val(region.nom);


}
