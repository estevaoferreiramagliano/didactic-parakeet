// Função para realizar a pesquisa
function searchFunction() {
  // Obter o valor digitado na barra de pesquisa
  const query = document.getElementById('searchInput').value;
  // Verificar se o campo de pesquisa está vazio ou não
  if (query) {
    // Exibir o termo de pesquisa digitado
    alert('Você está buscando por: ' + query);
  } else {
    // Solicitar ao usuário para digitar algo
    alert('Digite algo na barra de pesquisa!');
  }
}
