$(document).ready(function(){

    //hide all content fields at page load
    $(".field-content").hide();

    //set counter for show all
    var counter = true;

    //show all button
    $(".show-all-btn").click(function(){
        if(counter){
            $(this).text("Hide All");
            $(".field-content").slideDown();
            counter = false;
        } else {
            $(this).text("Show All");
            $(".field-content").slideUp();
            counter = true;
        }
    });

    //jQuery accordion menu
    $(".field-header").click(function(){
        $(this).next().slideToggle(300);
    });

    //push value from picture click to input box
    $("#level1").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("1");
    });
    $("#level2").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("2");
    });
    $("#level3").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("3");
    });
    $("#level4").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("4");
    });
    $("#level5").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("5");
    });
    $("#level6").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("6");
    });
    $("#level7").click(function(){
        $("#actualizationLevel").val("");
        $("#actualizationLevel").val("7");
    });

    $(".entry-content").hide();

    $(".entry-header").click(function(){

        $(this).next().slideToggle(300);

    });

    $(".show-all-analytics").click(function(){
        $(".entry-content").slideDown();
    });

});
