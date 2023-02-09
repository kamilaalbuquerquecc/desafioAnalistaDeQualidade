#language:pt
Funcionalidade: Salvar e visualizar o contato de uma empresa no funil de vendas


Cenário: Cadastro de usuario
Dado o usuario na tela de cadastro #: "https://app.leads2b.com/#/signup"
Quando informar os dados válidos
Então o cadastro será feito 
E o sistema retornará a mensagem “Seja Bem Vindo”

Cenário: Captação de dados
Pré-Condição: Usuario fez o cadastro na plataforma
Dado o usuário na tela de boas vindas 
E o sistema solicita algumas informações
Quando o usuário preenche as informações
Então o sistema retorna a pagina de prospecção

Cenário: Login de usuario
Dado o usuário na tela de login #: "https://app.leads2b.com/#/"
Quando informa as credenciais válidas
Então o sistema vai retornar a página "Home"

Cenário: Buscar empresas do segmento
Dado o usuário na pagina de home
Quando realiza uma busca por segmento do mercado de uma cidade especifica
Então o sistema retorna todas as empresas correspondentes

Cenário: Visualizar empresa
Dado o usuário na página de prospecção
Quando seleciona a empresa
Então o sistema retorna essa empresa com todas as informações

Cenário: Salvar empresa no funil de vendas
Dado o usuário na pagina de infomações da empresa
Quando salva a empresa no funil de vendas
Então a empresa é  salva
E mostra o botão de "Ver no funil de vendas"

Cenário: Visualizar funil de vendas 
Dado o usuário na pagina de infomações de uma empresa que está salva
Quando seleciona a opção de ver no funil de vendas
Então o sistema retorna a pagina de Negocios
E as empresas que foram salvas

Cenário: Visualizar negócios
Dado o usuário na pagina de infomações de uma empresa que está salva
Quando seleciona a opção de ver negocios
Então o sistema retorna as informações da empresa relacionado aos negocios

Cenário: Perder empresa
Dado o usuário na pagina de infomações dos negocios de uma empresa salva
Quando seleciona a opção de perder
E confirma 
Então a empresa é perdida e não fica visivel na pagina de negocios 
E fica disponivel a opção para reativar

Cenário: Visualizar funil de vendas pelo menu lateral
Dado o usuário logado no sistema
Quando acessa a opção de "Negócios" do menu lateral esquerdo
E filtra por Prospect
Então o sistema retorna a pagina de Negocios
E as empresas que foram salvas no funil de vendas

Cenário: Alterar Status da empresa Não Enriquecido-Recontato
Dado a empresa no status/coluna de "Não Enriquecido"
Quando o usuario clica sobre a empresa
E altera o status para "Recontato" 
Então a empresa ficará visivel na coluna de "Recontato"

Cenário: Alterar Status da empresa Não Enriquecido-Enriquecido
Dado a empresa no status/coluna de "Não Enriquecido"
Quando o usuario clica sobre a empresa
E altera o status para "Enriquecido" 
Então a empresa ficará visivel na coluna de "Enriquecido"

Cenário: Alterar Status da empresa Recontato-Enriquecido
Dado a empresa no status/coluna de "Recontato"
Quando o usuario clica sobre a empresa
E altera o status para "Enriquecido" 
Então a empresa ficará visivel na coluna de "Enriquecido"

Cenário: Alterar Status da empresa Recontato-Não Enriquecido
Dado a empresa no status/coluna de "Recontato"
Quando o usuario clica sobre a empresa
E altera o status para "Não Enriquecido" 
Então a empresa ficará visivel na coluna de "Não Enriquecido"

Cenário: Alterar Status da empresa Enriquecido-Recontato
Dado a empresa no status/coluna de "Enriquecido"
Quando o usuario clica sobre a empresa
E altera o status para "Recontato" 
Então a empresa ficará visivel na coluna de "Recontato"

Cenário: Alterar Status da empresa Enriquecido-Não Enriquecido
Dado a empresa no status/coluna de "Enriquecido"
Quando o usuario clica sobre a empresa
E altera o status para "Não Enriquecido" 
Então a empresa ficará visivel na coluna de "Não Enriquecido"






