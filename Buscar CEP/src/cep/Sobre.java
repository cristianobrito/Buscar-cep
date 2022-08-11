package cep;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Buscar CEP");
			lblNewLabel.setBounds(26, 40, 104, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("@Author Cristiano");
			lblNewLabel_1.setBounds(26, 82, 116, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Web Service");
			lblNewLabel_2.setBounds(26, 130, 91, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblWebService = new JLabel("republicavirtual.com.br");
			lblWebService.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				    link("https://www.republicavirtual.com.br/");
				}
			});
			lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblWebService.setForeground(SystemColor.textHighlight);
			lblWebService.setBounds(142, 130, 220, 14);
			getContentPane().add(lblWebService);
		}
		{
			JButton btnYoutube = new JButton("");
			btnYoutube.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://www.youtube.com/channel/UCkNsWkas2pwDltaer_USZZA");
				}
			});
			btnYoutube.setToolTipText("YOUTUBE");
			btnYoutube.setIcon(new ImageIcon(Sobre.class.getResource("/img/youtube.png")));
			btnYoutube.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnYoutube.setBorder(null);
			btnYoutube.setBackground(SystemColor.control);
			btnYoutube.setBounds(26, 202, 48, 48);
			getContentPane().add(btnYoutube);
			
			JButton btnGit = new JButton("");
			btnGit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://github.com/cristianobrito");
				}
			});
			btnGit.setToolTipText("Projeto");
			btnGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
			btnGit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGit.setBorder(null);
			btnGit.setBackground(SystemColor.control);
			btnGit.setBounds(344, 202, 48, 48);
			getContentPane().add(btnGit);
			
		}
	}
		private void link(String site) {
			Desktop desktop = Desktop.getDesktop();
			try {
				URI uri = new URI(site);
				desktop.browse(uri);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
