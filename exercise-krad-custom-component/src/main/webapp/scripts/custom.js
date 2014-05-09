function repeat(text) {
	console.log(text);
}

 jQuery(document).ready(function() {
    var covers = []
    jQuery.ajax({
        url : '/trnapp/remoting/coverService/Covers
        }).done(function(data) {
            covers = JSON.parse(data).results

            console.log("Covers are " + covers)
            console.log(jQuery('.carousel-inner > div.item > img'))
            jQuery('.carousel-inner > div.item > img').each(function(index, item) {
                console.log('setting cover to ' + covers[index])
                jQuery(item).attr('src', covers[index].imageUrl)
            });    

        });        
})