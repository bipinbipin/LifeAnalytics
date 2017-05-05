$(document).ready(function(){

    //set counter for accordion menu
    var counter = true;

    //hide all content fields at page load
    $(".field-content").hide();

    //jQuery accordion menu
    $(".field-header").click(function(){

        if(counter){
            $(this).parent().css("border-bottom-left-radius","0")
                .css("border-bottom-right-radius","0");
            $(this).children("h1").css("border-bottom-left-radius","0")
                .css("border-bottom-right-radius","0");
            $(this).next().slideDown(200);
            counter = false;
        } else {
            $(this).next().slideUp(200);
            $(this).parent().css("border-bottom-left-radius","5px")
                .css("border-bottom-right-radius","5px");
            $(this).children("h1").css("border-bottom-left-radius","5px")
                .css("border-bottom-right-radius","5px");
            counter = true;
        }

    });

});
