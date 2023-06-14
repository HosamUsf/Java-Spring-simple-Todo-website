<%@include file="common/header.jsp" %>
<%@include file="common/navigation.jsp" %>

<section>
    <div id="intro" class="p-5 text-center bg-light shadow-5 rounded-5 mb-5">
        <h1 class="mb-3 h2">Welcome to Todoit,  ${name}</h1>
        <p class="mb-3">where u can add & update and delete your <todos></todos></p>

        <a class="btn btn-primary m-2" href="list-todos"
           role="button">Manage Your Todos</a>
    </div>

</section>

<%@include file="common/footer.jsp" %>

