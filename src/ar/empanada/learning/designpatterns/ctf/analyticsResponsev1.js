
function piResponse() {
    piSetCookie('visitor_id12882', '525397055', 3650);
    piSetCookie('visitor_id12882-hash', '88c0755c81175bedeefd7693c90da292be5061ccb61687f021ab1dbfe86890306f1697850208af49d4ede2bc4080cdac68053c5b', 3650);

    if (document.location.protocol != "https:" || (document.location.protocol == "https:" && true)) {
        var analytics_link = document.location.protocol + "//" + "www2.infosecinstitute.com/analytics?";
        pi.tracker.visitor_id='525397055';

        pi.tracker.visitor_id_sign='88c0755c81175bedeefd7693c90da292be5061ccb61687f021ab1dbfe86890306f1697850208af49d4ede2bc4080cdac68053c5b';

        var variables = 'conly=true';
        for (property in pi.tracker) {
            variables += "&" + property + "=" + encodeURIComponent(pi.tracker[property]);
        }
        var headID = document.getElementsByTagName("head")[0];
        piScriptObj[piScriptNum] = document.createElement('script');
        piScriptObj[piScriptNum].type = 'text/javascript';
        piScriptObj[piScriptNum].src = analytics_link + variables;
        headID.appendChild(piScriptObj[piScriptNum]);
        piScriptObj[piScriptNum].onload = function() { return; }
    }
}
piResponse();




