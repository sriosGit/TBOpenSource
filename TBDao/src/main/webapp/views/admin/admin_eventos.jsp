<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, shrink-to-fit=no, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Simple Sidebar - Start Bootstrap Template</title>

<!-- Bootstrap Core CSS -->
<link href="../../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../../css/simple-sidebar.css" rel="stylesheet">
<link href="../../css/admin/hamburger.css" rel="stylesheet">

<link href="../../css/admin/table.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div | id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a href="../../index.jsp"> Eventos OS </a></li>
				<li><a href="admin_users.jsp">Usuarios</a></li>
				<li><a href="admin_eventos.jsp">Eventos</a></li>
				<li><a href="admin_categorias.jsp">Categorias</a></li>
				<li><a href="admin_distritos.jsp">Distritos</a></li>
				<li><br></li>
				<li><a href="">Cerrar Sesi&oacute;n</a></li>

			</ul>



		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">

			<div class="container-fluid">
				<button type="button" class="hamburger is-closed" id="hamburger"
					data-toggle="offcanvas">
					<span class="hamb-top"></span> <span class="hamb-middle"></span> <span
						class="hamb-bottom"></span>
				</button>
				<br>
				<div style="margin-top: 20px" class="container" >
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-primary">
								<div class="panel-heading">
									<h3 class="panel-title">Eventos</h3>
		<div class="pull-right">
							<span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
								<i class="glyphicon glyphicon-filter"></i>
							</span>
						</div>
								</div>
								<div class="panel-body">
									<input type="text" class="form-control" id="dev-table-filter"
										data-action="filter" data-filters="#dev-table"
										placeholder="Filtrar Usuarios" />
								</div>
								<table class="table table-hover" id="dev-table">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nombre</th>
											<th>Fecha Inicio</th>
											<th>Fecha Fin</th>
											<th>Hora</th>
											<th>Direcci&oacute;n</th>
											<th>Email</th>
											<th>Precio</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /#page-content-wrapper -->


	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="../../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../../js/bootstrap.min.js"></script>

	<!-- Menu Toggle Script -->
	<script type="text/javascript" src="../../js/admin/snippet_manager.js"></script>
	
</body>

</html>
