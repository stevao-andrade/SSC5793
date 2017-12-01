#!/usr/bin/env python
# -*- coding: utf-8 -*-

def create_exams():
	exams = {}
	questions = {}

	question = {}
	alternatives = {}

	question = {"id" : 1, "statement": "Marque a alternativa que corresponde a definição de framework"}
	alternatives["a"] = "Um conjunto integrado de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas. "	
	alternatives["b"] = "Um conjunto distribuído de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas."	
	question['alternatives'] = alternatives
	questions[1] = question 

	question = {}
	alternatives = {}

	question = {"id" : 2, "statement": "Framework do tipo  integração fornecem suporte para:"}
	alternatives["a"] = "Apoiar a comunicação e a troca de informações de componentes;"	
	alternatives["b"] = "Apoiar o desenvolvimento de aplicações;"	
	question['alternatives'] = alternatives
	questions[2] = question 

	question = {}
	alternatives = {}

	question = {"id" : 3, "statement": "Partes do framework que são projetados para serem genéricos, que podem ser adaptados às necessidades da aplicação” essa definição refere-se a:"}
	alternatives["a"] = "Hot spots"	
	alternatives["b"] = "Frozen spots"	
	question['alternatives'] = alternatives
	questions[3] = question 

	question = {}
	alternatives = {}

	question = {"id" : 4, "statement": "Como pode ser feito o reuso em frameworks do tipo caixa preta?"}
	alternatives["a"] = "Reúso por composição ou definição de interfaces para os componentes;"	
	alternatives["b"] = "Reúso por herança e associação dinâmica;"	
	question['alternatives'] = alternatives
	questions[4] = question 

	question = {}
	alternatives = {}

	question = {"id" : 5, "statement": "“Definem soluções para os problemas encontrados nos processos envolvidos na engenharia de software: desenvolvimento, controle de configuração, testes, etc”, a definição anterior está relacionada a qual categoria de padrões."}
	alternatives["a"] = "Padrões de processo"	
	alternatives["b"] = "Padrões de interface"	
	question['alternatives'] = alternatives
	questions[5] = question 

	question = {}
	alternatives = {}

	question = {"id" : 6, "statement": "“É uma coletânea de padrões relacionados (talvez relacionados apenas fracamente ou informalmente). Em geral subdivide os padrões em um pequeno número de categorias abrangentes e pode incluir algumas referências cruzadas entre os padrões [Appleton 97].” a definição anterior refere-se há:"}
	alternatives["a"] = "Catálogos de padrões"	
	alternatives["b"] = "Coleções de padrões"	
	question['alternatives'] = alternatives
	questions[6] = question 

	question = {}
	alternatives = {}

	question = {"id" : 7, "statement": "Considerando o processo “ Desenvolvimento para reuso”, assinale a alternativa que define corretamente esse processo."}
	alternatives["a"] = "Esse processo está interessado no desenvolvimento de componentes ou serviços que serão reusados em outras aplicações. Esse processo geralmente envolve generalizar os componentes existentes"	
	alternatives["b"] = "Esse é o processo de desenvolvimento de novas aplicações usando componentes e serviços existentes"	
	question['alternatives'] = alternatives
	questions[7] = question 

	question = {}
	alternatives = {}

	question = {"id" : 8, "statement": "Podemos definir engenharia dirigida por modelos como sendo?"}
	alternatives["a"] = "O software é representado como modelos de domínio e modelos de implementação independentes. O código é gerado a partir desses modelos."	
	alternatives["b"] = "Um sistema gerador incorpora o conhecimento de um tipo de aplicação, e é usado para gerar sistemas nesse domínio a partir de um modelo de sistema fornecido pelo usuário."	
	question['alternatives'] = alternatives
	questions[8] = question 

	question = {}
	alternatives = {}

	question = {"id" : 9, "statement": "“Um tipo de aplicação é generalizado em torno de uma arquitetura comum para que esta possa ser adaptada para diferentes clientes”, a definição anterior refere-se há:"}
	alternatives["a"] = "Linhas de produtos de software"	
	alternatives["b"] = "Sistemas são desenvolvidos pela configuração e integração de sistemas de aplicação existentes"	
	question['alternatives'] = alternatives
	questions[9] = question 

	question = {}
	alternatives = {}

	question = {"id" : 10, "statement": "Dentre os principais padrões para arquitetura orientada a serviços para web, temos o padrão  Web Service Definition Language (WSDL), podemos definir esse padrão como sendo:"}
	alternatives["a"] = "É um padrão para a definição de interface de serviço. Define como as operações de serviço (nomes de operação, parâmetros e seus tipos) e associações de serviço devem ser definidas"	
	alternatives["b"] = "É um padrão de trocas de mensagens que oferece suporte à comunicação entre os serviços. Ele define os componentes essenciais e opcionais das mensagens passadas entre serviços"	
	question['alternatives'] = alternatives
	questions[10] = question 
	
	exams[0]= {"name": "Prova de reuso", "questions" : questions}
	questions = {}

	question = {}
	alternatives = {}

	question = {"id" : 1, "statement": "Marque a alternativa que corresponde a definição de framework"}
	alternatives["a"] = "Um conjunto integrado de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas. "	
	alternatives["b"] = "Um conjunto distribuído de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas."	
	question['alternatives'] = alternatives
	questions[1] = question 

	question = {}
	alternatives = {}

	question = {"id" : 2, "statement": "Framework do tipo  integração fornecem suporte para:"}
	alternatives["a"] = "Apoiar a comunicação e a troca de informações de componentes;"	
	alternatives["b"] = "Apoiar o desenvolvimento de aplicações;"	
	question['alternatives'] = alternatives
	questions[2] = question 

	question = {}
	alternatives = {}

	question = {"id" : 3, "statement": "Partes do framework que são projetados para serem genéricos, que podem ser adaptados às necessidades da aplicação” essa definição refere-se a:"}
	alternatives["a"] = "Hot spots"	
	alternatives["b"] = "Frozen spots"	
	question['alternatives'] = alternatives
	questions[3] = question 

	question = {}
	alternatives = {}

	question = {"id" : 4, "statement": "Como pode ser feito o reuso em frameworks do tipo caixa preta?"}
	alternatives["a"] = "Reúso por composição ou definição de interfaces para os componentes;"	
	alternatives["b"] = "Reúso por herança e associação dinâmica;"	
	question['alternatives'] = alternatives
	questions[4] = question 

	question = {}
	alternatives = {}

	question = {"id" : 5, "statement": "“Definem soluções para os problemas encontrados nos processos envolvidos na engenharia de software: desenvolvimento, controle de configuração, testes, etc”, a definição anterior está relacionada a qual categoria de padrões."}
	alternatives["a"] = "Padrões de processo"	
	alternatives["b"] = "Padrões de interface"	
	question['alternatives'] = alternatives
	questions[5] = question 

	question = {}
	alternatives = {}

	question = {"id" : 6, "statement": "“É uma coletânea de padrões relacionados (talvez relacionados apenas fracamente ou informalmente). Em geral subdivide os padrões em um pequeno número de categorias abrangentes e pode incluir algumas referências cruzadas entre os padrões [Appleton 97].” a definição anterior refere-se há:"}
	alternatives["a"] = "Catálogos de padrões"	
	alternatives["b"] = "Coleções de padrões"	
	question['alternatives'] = alternatives
	questions[6] = question 

	question = {}
	alternatives = {}

	question = {"id" : 7, "statement": "Considerando o processo “ Desenvolvimento para reuso”, assinale a alternativa que define corretamente esse processo."}
	alternatives["a"] = "Esse processo está interessado no desenvolvimento de componentes ou serviços que serão reusados em outras aplicações. Esse processo geralmente envolve generalizar os componentes existentes"	
	alternatives["b"] = "Esse é o processo de desenvolvimento de novas aplicações usando componentes e serviços existentes"	
	question['alternatives'] = alternatives
	questions[7] = question 

	question = {}
	alternatives = {}

	question = {"id" : 8, "statement": "Podemos definir engenharia dirigida por modelos como sendo?"}
	alternatives["a"] = "O software é representado como modelos de domínio e modelos de implementação independentes. O código é gerado a partir desses modelos."	
	alternatives["b"] = "Um sistema gerador incorpora o conhecimento de um tipo de aplicação, e é usado para gerar sistemas nesse domínio a partir de um modelo de sistema fornecido pelo usuário."	
	question['alternatives'] = alternatives
	questions[8] = question 

	question = {}
	alternatives = {}

	question = {"id" : 9, "statement": "“Um tipo de aplicação é generalizado em torno de uma arquitetura comum para que esta possa ser adaptada para diferentes clientes”, a definição anterior refere-se há:"}
	alternatives["a"] = "Linhas de produtos de software"	
	alternatives["b"] = "Sistemas são desenvolvidos pela configuração e integração de sistemas de aplicação existentes"	
	question['alternatives'] = alternatives
	questions[9] = question 

	question = {}
	alternatives = {}

	question = {"id" : 10, "statement": "Dentre os principais padrões para arquitetura orientada a serviços para web, temos o padrão  Web Service Definition Language (WSDL), podemos definir esse padrão como sendo:"}
	alternatives["a"] = "É um padrão para a definição de interface de serviço. Define como as operações de serviço (nomes de operação, parâmetros e seus tipos) e associações de serviço devem ser definidas"	
	alternatives["b"] = "É um padrão de trocas de mensagens que oferece suporte à comunicação entre os serviços. Ele define os componentes essenciais e opcionais das mensagens passadas entre serviços"	
	question['alternatives'] = alternatives
	questions[10] = question 
	
	exams[1]= {"name": "Exame de teste A", "questions" : questions}
	questions = {}

	question = {}
	alternatives = {}

	question = {"id" : 1, "statement": "Marque a alternativa que corresponde a definição de framework"}
	alternatives["a"] = "Um conjunto integrado de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas. "	
	alternatives["b"] = "Um conjunto distribuído de artefatos de software (como classes, objetos e componentes) que colaboram para fornecer uma arquitetura reusável para uma família de aplicações relacionadas."	
	question['alternatives'] = alternatives
	questions[1] = question 

	question = {}
	alternatives = {}

	question = {"id" : 2, "statement": "Framework do tipo  integração fornecem suporte para:"}
	alternatives["a"] = "Apoiar a comunicação e a troca de informações de componentes;"	
	alternatives["b"] = "Apoiar o desenvolvimento de aplicações;"	
	question['alternatives'] = alternatives
	questions[2] = question 

	question = {}
	alternatives = {}

	question = {"id" : 3, "statement": "Partes do framework que são projetados para serem genéricos, que podem ser adaptados às necessidades da aplicação” essa definição refere-se a:"}
	alternatives["a"] = "Hot spots"	
	alternatives["b"] = "Frozen spots"	
	question['alternatives'] = alternatives
	questions[3] = question 

	question = {}
	alternatives = {}

	question = {"id" : 4, "statement": "Como pode ser feito o reuso em frameworks do tipo caixa preta?"}
	alternatives["a"] = "Reúso por composição ou definição de interfaces para os componentes;"	
	alternatives["b"] = "Reúso por herança e associação dinâmica;"	
	question['alternatives'] = alternatives
	questions[4] = question 

	question = {}
	alternatives = {}

	question = {"id" : 5, "statement": "“Definem soluções para os problemas encontrados nos processos envolvidos na engenharia de software: desenvolvimento, controle de configuração, testes, etc”, a definição anterior está relacionada a qual categoria de padrões."}
	alternatives["a"] = "Padrões de processo"	
	alternatives["b"] = "Padrões de interface"	
	question['alternatives'] = alternatives
	questions[5] = question 

	question = {}
	alternatives = {}

	question = {"id" : 6, "statement": "“É uma coletânea de padrões relacionados (talvez relacionados apenas fracamente ou informalmente). Em geral subdivide os padrões em um pequeno número de categorias abrangentes e pode incluir algumas referências cruzadas entre os padrões [Appleton 97].” a definição anterior refere-se há:"}
	alternatives["a"] = "Catálogos de padrões"	
	alternatives["b"] = "Coleções de padrões"	
	question['alternatives'] = alternatives
	questions[6] = question 

	question = {}
	alternatives = {}

	question = {"id" : 7, "statement": "Considerando o processo “ Desenvolvimento para reuso”, assinale a alternativa que define corretamente esse processo."}
	alternatives["a"] = "Esse processo está interessado no desenvolvimento de componentes ou serviços que serão reusados em outras aplicações. Esse processo geralmente envolve generalizar os componentes existentes"	
	alternatives["b"] = "Esse é o processo de desenvolvimento de novas aplicações usando componentes e serviços existentes"	
	question['alternatives'] = alternatives
	questions[7] = question 

	question = {}
	alternatives = {}

	question = {"id" : 8, "statement": "Podemos definir engenharia dirigida por modelos como sendo?"}
	alternatives["a"] = "O software é representado como modelos de domínio e modelos de implementação independentes. O código é gerado a partir desses modelos."	
	alternatives["b"] = "Um sistema gerador incorpora o conhecimento de um tipo de aplicação, e é usado para gerar sistemas nesse domínio a partir de um modelo de sistema fornecido pelo usuário."	
	question['alternatives'] = alternatives
	questions[8] = question 

	question = {}
	alternatives = {}

	question = {"id" : 9, "statement": "“Um tipo de aplicação é generalizado em torno de uma arquitetura comum para que esta possa ser adaptada para diferentes clientes”, a definição anterior refere-se há:"}
	alternatives["a"] = "Linhas de produtos de software"	
	alternatives["b"] = "Sistemas são desenvolvidos pela configuração e integração de sistemas de aplicação existentes"	
	question['alternatives'] = alternatives
	questions[9] = question 

	question = {}
	alternatives = {}

	question = {"id" : 10, "statement": "Dentre os principais padrões para arquitetura orientada a serviços para web, temos o padrão  Web Service Definition Language (WSDL), podemos definir esse padrão como sendo:"}
	alternatives["a"] = "É um padrão para a definição de interface de serviço. Define como as operações de serviço (nomes de operação, parâmetros e seus tipos) e associações de serviço devem ser definidas"	
	alternatives["b"] = "É um padrão de trocas de mensagens que oferece suporte à comunicação entre os serviços. Ele define os componentes essenciais e opcionais das mensagens passadas entre serviços"	
	question['alternatives'] = alternatives
	questions[10] = question 
	
	exams[2]= {"name": "Exame de teste B", "questions" : questions}
	return exams

def create_correct_answers():
	exams_feedback = {}
	correct_answers = {} 
	correct_answers[1] = [ 'a', 1.0 ] 
	correct_answers[2] = [ 'a', 1.0 ] 
	correct_answers[3] = [ 'a', 1.0 ] 
	correct_answers[4] = [ 'a', 1.0 ] 
	correct_answers[5] = [ 'a', 1.0 ] 
	correct_answers[6] = [ 'a', 1.0 ] 
	correct_answers[7] = [ 'a', 1.0 ] 
	correct_answers[8] = [ 'a', 1.0 ] 
	correct_answers[9] = [ 'a', 1.0 ] 
	correct_answers[10] = [ 'a', 1.0 ] 
	exams_feedback[0]= {"name": "Prova de reuso", "answers" : correct_answers}
	print correct_answers
	correct_answers = {} 
	correct_answers[1] = [ 'a', 1.0 ] 
	correct_answers[2] = [ 'a', 1.0 ] 
	correct_answers[3] = [ 'a', 1.0 ] 
	correct_answers[4] = [ 'b', 1.0 ] 
	correct_answers[5] = [ 'a', 1.0 ] 
	correct_answers[6] = [ 'a', 1.0 ] 
	correct_answers[7] = [ 'b', 1.0 ] 
	correct_answers[8] = [ 'b', 1.0 ] 
	correct_answers[9] = [ 'a', 1.0 ] 
	correct_answers[10] = [ 'a', 1.0 ] 
	exams_feedback[1]= {"name": "Exame de teste A", "answers" : correct_answers}
	print correct_answers
	correct_answers = {} 
	correct_answers[1] = [ 'b', 1.0 ] 
	correct_answers[2] = [ 'a', 1.0 ] 
	correct_answers[3] = [ 'b', 1.0 ] 
	correct_answers[4] = [ 'a', 1.0 ] 
	correct_answers[5] = [ 'b', 1.0 ] 
	correct_answers[6] = [ 'a', 1.0 ] 
	correct_answers[7] = [ 'a', 1.0 ] 
	correct_answers[8] = [ 'b', 1.0 ] 
	correct_answers[9] = [ 'a', 1.0 ] 
	correct_answers[10] = [ 'a', 1.0 ] 
	exams_feedback[2]= {"name": "Exame de teste B", "answers" : correct_answers}
	print correct_answers
	return exams_feedback

def exame_corrector(your_answers, correct_answers):
	grade = 0
	for i in range(1,len(correct_answers)+1):
		your_answer = your_answers[i]
		correct_answer = correct_answers[i]
		if(your_answer == correct_answer[0]):
			grade = grade + correct_answer[1]
	
	print('Your test score: ' + str(grade))


if __name__ == '__main__':
	exam_selected = None
	your_answers = {}
	exams = create_exams()
	exam_names = exams.keys()

	for k in sorted(exam_names):
		print "%s - %s" % (k, exams[k]["name"])
	while True:
		try:
			exam_selected = int(raw_input("Please chose an exam: "))
		except ValueError:
			print("Plase, select a number.")
			continue
		else:
			if exam_selected in exams.keys(): 
				print("Selected - %s") % (str(exam_selected))
				break
			else:
				print("Please, select a valid exam.")
				continue
	exam = exams[exam_selected]
	questions = exam['questions']
	
	for id, question in questions.iteritems():
		
		q_id = question["id"]
		q_statement =  question["statement"]
		alternatives = question["alternatives"]
		
		print "%d) %s" % (id, q_statement)		
		print ""
		for a_id, a_statement in alternatives.iteritems():
			print "	%s) %s" % (a_id, a_statement)
			print ""
			
		while True:
			try:
				a = str(raw_input("Enter the correct alternative: "))
			except ValueError:
				print("Plase, select an alternative")
				continue
			else:
				if a in alternatives.keys(): 
					print("Alternative selected - %s") % (a)
					print ""
					break
				else:
					print("Please, a valid alternative.")
					continue
			
		your_answers[id] = a
			
	print("Your answers: ")
	for k,v in your_answers.iteritems():
		print("Question " + str(k)+": " + str(v))
	
	exams_feedback = create_correct_answers()
	correct_answers =  exams_feedback[exam_selected]["answers"]
	exame_corrector(your_answers, correct_answers)

