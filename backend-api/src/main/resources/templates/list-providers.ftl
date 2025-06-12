<#-- list-providers.ftl -->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>All Providers</title></head>
<body>
  <h1>Providers</h1>
  <a href="/providers/new">+ Add New Provider</a>
  <table>
    <thead>
      <tr><th>ID</th><th>Name</th><th>Email</th><th>Description</th><th>Location</th></tr>
    </thead>
    <tbody>
      <#list providers as p>
        <tr>
          <td>${p.id}</td>
          <td>${p.name}</td>
          <td>${p.email}</td>
          <td>${p.description}</td>
          <td>${p.location}</td>
        </tr>
      </#list>
    </tbody>
  </table>
</body>
</html>
