

<!-- local-development:start -->
# Desarrollo local

Puedes abrir este repositorio en VS Code, Antigravity o Sublime Text. El compilador y los servicios necesarios dependen del componente indicado abajo.

## Archivos ignorados

`.gitignore` excluye credenciales locales, estado del editor y salidas de las herramientas detectadas. No deja de versionar archivos que ya estaban en Git. Los manifiestos, archivos de bloqueo, recursos fuente y scripts de esquema forman parte del código.
<!-- local-development:end -->


<!-- improvements-20261120:start -->
## Mejoras y verificación — 2026-11-20 (Repositorio Java de notas y vista previa interactiva Material 3)

- **Cambios:** Añadidos `app/NotesRepository.java` (gestor inmutable de notas con validación) y vista previa interactiva `web-demo/index.html` estilo Android Material 3 con notas persistentes en `localStorage` y tema claro/oscuro.
- **Validación:** Compilación y prueba JDK 17 (`NotesRepository`) + Node 24 `node --test web-demo/tests/demo.test.mjs` aprobados.
<!-- improvements-20261120:end -->
