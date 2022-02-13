<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<head>
				<title></title>
			</head>
			<body>
				<h1>
					<xsl:value-of select="firstname" />
				</h1>
				<h2>
					<xsl:value-of select="lastname" />
				</h2>

			</body>
		</html>

	</xsl:template>
</xsl:stylesheet>