package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class telaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtArea;
	private JTextField txtCargaHoraria;
	private JTextField txtPreco;
	private JTextField txtIDSala;
	private JTextField txtDescricaoSala;
	private JTextField txtProfessor;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtAula;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtProfessor1;
	private JTextField txtCurso;
	private JTextField txtSala;
	private JTextField txtNomeAluno;
	private JTextField txtCPF1;
	private JTextField txtIdade;
	private JTextField txtEmail1;
	
	//Declaração dos itens para criar uma aula:
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas;
	private List<Aluno>listaAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaAulas frame = new telaAulas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaAulas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Nano-Tech-GMBH-AT-eM50.32.png"));
		
		
		//Vamos instanciar as nossas classes para gerar objetos
		//dos itens relacionados a aula.
		//Esses objetos estão vazios e serão preenchidos quando o
		//usuário clicar nos botões de incluir
		curso = new Curso();
		listaAluno = new ArrayList<Aluno>();
		sala = new Sala();
		professor = new Professor();
		aulas = new Aulas();
		
		
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(SystemColor.activeCaption);
		panel_curso.setBounds(10, 23, 621, 67);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título do Curso:");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(5, 14, 79, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(94, 11, 124, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Área:");
		lblNewLabel_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 39, 46, 14);
		panel_curso.add(lblNewLabel_1);
		
		txtArea = new JTextField();
		txtArea.setBounds(94, 36, 124, 20);
		panel_curso.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Carga Horária:");
		lblNewLabel_2.setBackground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(269, 14, 99, 14);
		panel_curso.add(lblNewLabel_2);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(378, 11, 124, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Preço:");
		lblNewLabel_3.setBackground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(279, 39, 46, 14);
		panel_curso.add(lblNewLabel_3);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(378, 36, 124, 20);
		panel_curso.add(txtPreco);
		txtPreco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 86, 621, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtIDSala = new JTextField();
		txtIDSala.setBounds(119, 24, 151, 20);
		panel.add(txtIDSala);
		txtIDSala.setColumns(10);
		
		JLabel text = new JLabel("Descrição da Sala:");
		text.setForeground(new Color(0, 0, 0));
		text.setFont(new Font("Tahoma", Font.PLAIN, 11));
		text.setBounds(10, 60, 100, 14);
		panel.add(text);
		
		txtDescricaoSala = new JTextField();
		txtDescricaoSala.setBounds(119, 57, 379, 49);
		panel.add(txtDescricaoSala);
		txtDescricaoSala.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Identificação da Sala:");
		lblNewLabel_4.setBounds(10, 27, 122, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 205, 621, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Professor:");
		lblNewLabel_6.setBounds(10, 11, 71, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CPF:");
		lblNewLabel_7.setBounds(299, 11, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("e-mail:");
		lblNewLabel_8.setBounds(10, 42, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		txtProfessor = new JTextField();
		txtProfessor.setBounds(79, 8, 134, 20);
		panel_1.add(txtProfessor);
		txtProfessor.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(64, 39, 410, 20);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(329, 8, 134, 20);
		panel_1.add(txtCPF);
		txtCPF.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(10, 354, 621, 97);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("ID Aula:");
		lblNewLabel_9.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_9);
		
		txtAula = new JTextField();
		txtAula.setBounds(74, 8, 86, 20);
		panel_2.add(txtAula);
		txtAula.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Início:");
		lblNewLabel_10.setBounds(192, 11, 46, 14);
		panel_2.add(lblNewLabel_10);
		
		txtInicio = new JTextField();
		txtInicio.setBounds(234, 8, 86, 20);
		panel_2.add(txtInicio);
		txtInicio.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Término:");
		lblNewLabel_11.setBounds(353, 11, 56, 14);
		panel_2.add(lblNewLabel_11);
		
		txtTermino = new JTextField();
		txtTermino.setBounds(419, 8, 86, 20);
		panel_2.add(txtTermino);
		txtTermino.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Alunos:");
		lblNewLabel_12.setBounds(10, 42, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Professor:");
		lblNewLabel_13.setBounds(167, 42, 71, 14);
		panel_2.add(lblNewLabel_13);
		
		txtProfessor1 = new JTextField();
		txtProfessor1.setBounds(234, 36, 86, 20);
		panel_2.add(txtProfessor1);
		txtProfessor1.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Curso:");
		lblNewLabel_14.setBounds(10, 72, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(74, 69, 86, 20);
		panel_2.add(txtCurso);
		txtCurso.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Sala:");
		lblNewLabel_15.setBounds(192, 72, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		txtSala = new JTextField();
		txtSala.setBounds(234, 69, 86, 20);
		panel_2.add(txtSala);
		txtSala.setColumns(10);
		
		JComboBox cboAluno = new JComboBox();
		cboAluno.setBounds(74, 38, 86, 22);
		panel_2.add(cboAluno);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(10, 272, 621, 82);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Nome do Aluno:");
		lblNewLabel_17.setBounds(10, 11, 99, 14);
		panel_3.add(lblNewLabel_17);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(119, 8, 86, 20);
		panel_3.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("CPF:");
		lblNewLabel_18.setBounds(215, 11, 46, 14);
		panel_3.add(lblNewLabel_18);
		
		txtCPF1 = new JTextField();
		txtCPF1.setBounds(271, 8, 111, 20);
		panel_3.add(txtCPF1);
		txtCPF1.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Idade:");
		lblNewLabel_19.setBounds(399, 11, 46, 14);
		panel_3.add(lblNewLabel_19);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(442, 8, 39, 20);
		panel_3.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("e-mail:");
		lblNewLabel_20.setBounds(10, 43, 46, 14);
		panel_3.add(lblNewLabel_20);
		
		txtEmail1 = new JTextField();
		txtEmail1.setBounds(52, 40, 391, 20);
		panel_3.add(txtEmail1);
		txtEmail1.setColumns(10);
		
		JButton btnIncluirCurso = new JButton("Incluir Curso");
		btnIncluirCurso.setIcon(new ImageIcon("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Space-Smsun.32.png"));
		btnIncluirCurso.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Obter o texto que está na caixa de "Titulo do Curso" e
				//adicionar à caixa "Curso" que está na área do "Criar Aula":
				txtCurso.setText(txtTituloCurso.getText());
				//Vamos adicionar os elementos do curso ao objeto curso, tais como:
				//título, carga horária, datainício...
				curso.setTitulo(txtTituloCurso.getText());
				curso.setArea(txtArea.getText());
				curso.setCargaHoraria(txtCargaHoraria.getText());
				curso.setPreco(Double.parseDouble(txtPreco.getText()));
				
				
				//Vamos desativar o painel de cursos. Vamos usar 
				//o comando enabled com valor false:
				txtTituloCurso.setEnabled(false);
				txtArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtPreco.setEnabled(false);
				btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 462, 127, 37);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir Sala");
		btnIncluirSala.setIcon(new ImageIcon("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Space-Smsaturn.32.png"));
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
								
				//Preencher os dados do objeto sala:
				sala.setIdentificacao(txtSala.getText());
				sala.setDescricao(txtDescricaoSala.getText());
								
				
			    txtSala.setText(txtIDSala.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIDSala.setEnabled(false);
				txtDescricaoSala.setEnabled(false);
			}
		});
		btnIncluirSala.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIncluirSala.setBounds(147, 462, 117, 37);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir Professor");
		btnIncluirProfessor.setIcon(new ImageIcon("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Space-Smneptune.32.png"));
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				professor.setNome(txtProfessor.getText());
				professor.setEmail(txtEmail.getText());
				professor.setCpf(txtCPF.getText());
				
				txtProfessor1.setText(txtProfessor.getText());
				
				
				btnIncluirProfessor.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtCPF.setEnabled(false);
				txtEmail.setEnabled(false);
				
				
			}
		});
		btnIncluirProfessor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIncluirProfessor.setBounds(274, 462, 117, 37);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir Aluno");
		btnIncluirAluno.setIcon(new ImageIcon("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Space-Smjupiter.32.png"));
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno = new Aluno();
				aluno.setNome(txtNomeAluno.getText());
				aluno.setEmail(txtEmail1.getText());
				aluno.setCpf(txtCPF1.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				listaAluno.add(aluno);
				
				
				
				
				cboAluno.addItem(txtNomeAluno.getText());
				
				
				
				txtCPF1.setEnabled(false);
				txtIdade.setEnabled(false);
				txtEmail1.setEditable(false);
				
			}
		});
		btnIncluirAluno.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnIncluirAluno.setBounds(395, 462, 111, 37);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAula = new JButton("Criar Aula");
		btnCriarAula.setIcon(new ImageIcon("C:\\Users\\lais.nfarias\\Downloads\\Iconfactory-Space-Smearth.32.png"));
		btnCriarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aulas.setId(Integer.parseInt(txtAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setAluno(listaAluno.toArray(new Aluno[0]));
				aulas.setSala(sala);
				
				txtAula.setEnabled(false);
				txtCurso.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtSala.setEnabled(false);
				
				System.out.print(cboAluno.getItemAt(0));
		
				
				btnCriarAula.setEnabled(false);
				txtAula.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtNomeAluno.setEnabled(false);
				txtProfessor1.setEnabled(false);
				txtCurso.setEnabled(false);
				txtSala.setEnabled(false);
			}
		});
		btnCriarAula.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCriarAula.setBounds(512, 462, 119, 37);
		contentPane.add(btnCriarAula);
	}
}
