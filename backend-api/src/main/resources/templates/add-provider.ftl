<#-- add-provider.ftl -->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Add Provider</title></head>
<body>
  <h1>New Provider</h1>
  <form action="/providers" method="post">
    <p><label>Name:<br/><input type="text" name="name" value="${provider.name!}"/></label></p>
    <p><label>Email:<br/><input type="email" name="email" value="${provider.email!}"/></label></p>
    <p><label>Description:<br/><textarea name="description">${provider.description!}</textarea></label></p>
    <p><label>Location:<br/><input type="text" name="location" value="${provider.location!}"/></label></p>
    <p>
      <button type="submit">Create Provider</button>
      <a href="/providers">Cancel</a>
    </p>
  </form>
</body>
</html>
