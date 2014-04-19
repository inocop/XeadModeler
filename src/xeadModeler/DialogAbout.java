package xeadModeler;

/*
 * Copyright (c) 2014 WATANABE kozo <qyf05466@nifty.com>,
 * All rights reserved.
 *
 * This file is part of XEAD Modeler.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the XEAD Project nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;

public class DialogAbout extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	/**
	 * Application Information
	 */
	public static final String APPLICATION_NAME  = "XEAD Modeler 1.4";
	public static final String PRODUCT_NAME = "XEAD[zi:d] Modeler";
	public static final String FULL_VERSION  = "V1.R4.M1";
	//
	// 1.4.1�ł̕ύX�_
	//�E�Ɩ��t���[�ƃf�[�^���f����ł̋�`�I���K�C�h�̐F�𐅐F���甒�ɕύX����
	//�Exeadmdl.properties�̌����������A(1)��`�t�@�C��(*.xead)������t�H���_�A(2)xeadmdl.jar������t�H���_�A�ɂ���
	//
	// 1.4.0�ł̕ύX�_
	//�Exeadmdl.properties�Ńt�H���g�����w��ł���悤�ɂ���
	//�E�ꕔ�̗v�f�������A�t�H���g�T�C�Y��12p����16p�ɕύX����
	//�EIO�C���[�W�̃t�H���g�T�C�Y�̎w��͈͂�10�`14����10�`20�Ɋg������
	//�E�Ɩ��t���[�ƃf�[�^���f���ɂ��āA�ꕔ�̃e�L�X�g�̃t�H���g�T�C�Y��������������悤�ɂ���
	//�E�Ɩ��t���[�̃C�x���g�ɂ��ĕ\���ݒ�l�������P����
	//�E�Ɩ��t���[��ŕ����̃v���Z�X��X�g���[�W����`�I�����ē����Ɉړ��ł���悤�ɂ���
	//�E�f�[�^���f����̃e�[�u���ɂ��āA�t�B�[���h�Q����ɂP�i�Ŏ����悤�ɂ����i�����i�ŕ\������ƃC���X�^���X�������ɂ����Ȃ邽�߁j
	//�E�f�[�^���f����̑S�e�[�u���̕��������ݒ肷�邽�߂̃R���e�L�X�g���j���[��݂���
	//�E�f�[�^���f����ŕ����̃e�[�u��������`�I�����ē����Ɉړ��ł���悤�ɂ���
	//
	// 57�ł̕ύX�_
	//�E�Ɩ��t���[��̃X�g���[�W�ƃf�[�^�t���[�ɂ��āA�_�u���N���b�N����΋L�q�ύX�_�C�A���O�������悤�ɂ���
	//
	// 56�ł̕ύX�_
	//�E�t�@�C���I���_�C�A���O�̊g���q�ݒ�����P����
	//�E�f�[�^�^�C�v�ʂ̃t�B�[���h�ꗗ�\���̃p�t�H�[�}���X�����P����
	//
	// 55�ł̕ύX�_
	//�E�ێ痚���̏����l�ɓ�����e�̍s���܂܂�Ȃ��悤�ɂ���
	//�E�ێ痚���̓����̋�؂蕶�����h�b�g����A���_�[�o�[�ɕύX����
	//�ESQL�C���|�[�g�Łw�����̃t�B�[���h�R�����g���t�B�[���h��`���Ƃ݂Ȃ��x���`�F�b�N����Ƃo�j����������Ȃ��o�O���C��
	//�E�t�B�[���h���̃f�[�^�^�C�v�̌����\���`�������P����
	//�E�f�[�^���f����Ɩ��t���[��̃q���g�\���������ɂȂ�Ȃ��悤�ɂ���
	//
	// 54�ł̕ύX�_
	//�E�Ɩ��t���[��̃v���Z�X���_�u���N���b�N����΋Ɩ���`�ɃW�����v����悤�ɂ���
	//�E�f�[�^���f����̃e�[�u�����_�u���N���b�N����΃e�[�u����`�ɃW�����v����悤�ɂ���
	//�E�Ɩ���`��̓��o�̓C���[�W���_�u���N���b�N����΋@�\��`�ɃW�����v����悤�ɂ���
	//�E�����_�C�A���O�ł̌������ʂ̖��̂ɂh�c���܂߂�悤�ɂ���
	//�ECRUD�}�����o�͂��邽�߂ɁA�c�[�����j���[�Ɂu�}�g���b�N�X���X�g�o�́v��ǉ�����
	//�E�Ɩ���`�̓��o�̓C���[�W�����̃��x���̒������e�L�X�g���ɍ��킹��悤�ɂ���
	//�EUndo�̉񐔂𖳐����ɂ���ƂƂ��ɁAUndo�����g���ĕێ痚���̏����l��ݒ肷��悤�ɂ���
	//�E�Ɩ��^�C�v�̑g�ݍ��݂̉e���ňꕔ��Undo���삪���܂������Ȃ������o�O���C������
	//
	// 53�ł̕ύX�_
	//�E�Ɩ��^�C�v�̉e���ŋƖ���`�̍X�V���[�`�����ُ�I�����邱�Ƃ̂���o�O���C������
	//
	// 52�ł̕ύX�_
	//�E�Ɩ���`�̃C�x���g���u�����N�ɂ���΁A�Ɩ��t���[��́u�����}�[�N�v���\������Ȃ��悤�ɂ���
	//�iGithub��ł�1.3.51�Ŕ��f�ρj
	//�E�Ɩ���`���̋@�\UI�\���̍����̃L���v�V�������@�\ID�{���o��ID����@�\ID�{���o�͖��ɕύX����
	//�E�f�[�^���f����Ɩ��t���[�̈���o�͂ɂ����āA���{����ł�ID��S�p�����ɕϊ����ďo�͂���悤�ɂ���
	//�iJava7��Graphics2D�̕�����`�揈���̃o�O�ɂ��ƂÂ��b��d�l�j
	//�E�f�[�^���f������������ꍇ�A�e�[�u����CRUD�\���̉E�����؂������C��
	//�E�Ɩ���`���Ɂu���̋Ɩ����܂ދƖ��t���[�v�����X�g���ăW�����v�ł���悤�ɂ���
	//�E�Ɩ��t���[��Ńm�[�h���R�s�[����ƃ��x���̂Q�s�ڂ��R�s�[����Ȃ������C��
	//�E�V�X�e���ϐ��Ƃ��āu�Ɩ��^�C�v�v��ǉ����āA�Ɩ���`�őI���ł���悤�ɂ���
	//�E�Ɩ��t���[��Ńf�[�^�t���[��ǉ�����_�C�A���O�ŁA�m�[�h�̂Q�s�ڂ��m�[�h���Ɋ܂߂�悤�ɂ���
	//�E�Ɩ���`�̃A�N�V�������R�s�[����ۂɁu���ʃA�N�V�����v���܂߂ăR�s�[���邩�ǂ�����I�����邽�߂̃_�C�A���O��\������悤�ɂ���
	//�E�f�[�^�t���[�̃A�C�R���̓E�v�u�d�C�M���v���u���,�f�[�^�v�ɕύX����
	//�E�Ɩ���`�̃A�N�V�����ł̂h�n�̃��x���ɋ@�\�^�C�v�����܂߂�悤�ɂ���
	//�E�t�B�[���h�ꗗ�̈ꗗ�n�����̃��X�|���X��啝�ɉ��P����
	//
	// 51�ł̕ύX�_
	//�E�Ɩ��t���[���C���|�[�g�ł���悤�ɂ���
	//�E�Ɩ��t���[��̃v���Z�X�̕ύX�_�C�A���O�ŁA�C�x���g�ʒu�����ݒl�Ŏ�����Ȃ������C��
	//�E�Ɩ��t���[�́u�v���Z�X�v�ȊO�̃m�[�h�ŁA�t���[�Ɠ��l�Ɂu���x���v���Q�s�u����悤�ɂ���
	//�E�Ɩ��t���[�𕡎ʂ����ꍇ�A�m�[�h�̂Q�s�ڂ̃��x���ƃv���Z�X�E�m�[�h�̃C�x���g�ʒu���R�s�[����Ȃ������C��
	//�E�f�[�^���f����Ńe�[�u�����\���ɂ��Ă��C���X�^���X���\������邱�Ƃ���������C��
	//�E�f�[�^���f����ł̃e�[�u���֘A�ǉ��p�_�C�A���O���́A�V�K�t�B�[���h�ǉ�����ɂ���������h�c�̐ݒ胍�W�b�N�̃o�O���C������
	//�i�����t�B�[���h��ǉ�����ۂɓ��������h�c��^����悤�ɂȂ��Ă����j
	//�E�f�[�^���f���̃e�[�u���֘A���`�揈���ɂ����āA�����Ȋ֘A���f�[�^�����݂���ꍇ�Ɏ����I�ɂ�����폜����悤�ɂ���
	//�E�f�[�^���f����Ɩ��t���[�̈���o�͂ɂ����āA�L���v�V�����̔z�u�Ɋւ���d�l���C������
	//�iJava7��Graphics2D�̕�����`�揈���̃o�O�ɂ��ƂÂ��b��d�l�j
	//
	// 50�ł̕ύX�_
	//�E����A�e�[�u���^�C�v�A�f�[�^�^�C�v�A�@�\�^�C�v�ʂ̒�`�v�f�̈ꗗ��ID���ɂȂ�悤�ɏC��
	//�E�t�B�[���hID�̓��͈�̕����g��
	//�E�t�B�[���h�ꗗ��̃L�[�t�B�[���h�𑾎��\���ɂ���ƂƂ��ɁACSV�o�͂ő�����*�t�ɕϊ�����X�e�b�v��ǉ�
	//�E�ꕔ�̃h���b�O�h���b�v�Ώۂ̃R���|�[�l���g�ŁA�}�E�X�I�[�o�[���邾���ŃJ�[�\�����ω����Ă��������C��
	//�E�Ɩ��t���[�Ƀm�[�h��ǉ������ꍇ�ɑO��Ƀm�[�h�ɑ΂��ē��͂����E�v���N���A����Ȃ������C��
	//�E�c���[�r���[��� Ctrl+C,Ctrl+V,Ctrl+X ���g����悤�ɂ���ƂƂ��ɁA�����m�[�h�𓯎��I���ł��Ȃ��悤�ɂ���
	//�E�E�y�C���Œl��ύX�����Ctrl+S�������Ă��㏑������Ȃ����������C��
	public static final String FORMAT_VERSION  = "1.2";
	public static final String COPYRIGHT = "Copyright 2004-2014 DBC,Ltd.";
	public static final String URL_DBC = "http://homepage2.nifty.com/dbc/";
	/**
	 * Components on the panel
	 */
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel insetsPanel1 = new JPanel();
	private JPanel insetsPanel2 = new JPanel();
	private JPanel insetsPanel3 = new JPanel();
	private JButton button1 = new JButton();
	private JLabel imageLabel = new JLabel();
	private JLabel labelName = new JLabel();
	private JLabel labelVersion = new JLabel();
	private JLabel labelCopyright = new JLabel();
	private JLabel labelURL = new JLabel();
	private ImageIcon imageXead = new ImageIcon();
	private HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
	private Desktop desktop = Desktop.getDesktop();

	public DialogAbout(Modeler parent) {
		super(parent);
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit(parent);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit(Modeler parent) throws Exception  {
		imageXead = new ImageIcon(xeadModeler.Modeler.class.getResource("title.png"));
		imageLabel.setIcon(imageXead);
		panel1.setLayout(new BorderLayout());
		panel1.setBorder(BorderFactory.createEtchedBorder());
		panel2.setLayout(new BorderLayout());
		insetsPanel2.setLayout(new BorderLayout());
		insetsPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		insetsPanel2.setPreferredSize(new Dimension(75, 52));
		insetsPanel2.add(imageLabel, BorderLayout.EAST);

		labelName.setFont(new java.awt.Font("Serif", 1, 20));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setText(PRODUCT_NAME);
		labelName.setBounds(new Rectangle(0, 8, 240, 22));
		labelVersion.setFont(new java.awt.Font("Dialog", 0, 16));
		labelVersion.setHorizontalAlignment(SwingConstants.CENTER);
		labelVersion.setText(FULL_VERSION);
		labelVersion.setBounds(new Rectangle(0, 32, 240, 20));
		labelCopyright.setFont(new java.awt.Font("Dialog", 0, 16));
		labelCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		labelCopyright.setText(COPYRIGHT);
		labelCopyright.setBounds(new Rectangle(0, 53, 240, 20));
		labelURL.setFont(new java.awt.Font("Dialog", 0, 16));
		labelURL.setHorizontalAlignment(SwingConstants.CENTER);
		labelURL.setText("<html><u><font color='blue'>" + URL_DBC);
		labelURL.setBounds(new Rectangle(0, 75, 240, 20));
		labelURL.addMouseListener(new DialogAbout_labelURL_mouseAdapter(this));
		insetsPanel3.setLayout(null);
		insetsPanel3.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 10));
		insetsPanel3.setPreferredSize(new Dimension(250, 80));
		insetsPanel3.add(labelName, null);
		insetsPanel3.add(labelVersion, null);
		insetsPanel3.add(labelCopyright, null);
		insetsPanel3.add(labelURL, null);

		button1.setText("OK");
		button1.addActionListener(this);
		insetsPanel1.add(button1, null);

		panel1.add(insetsPanel1, BorderLayout.SOUTH);
		panel1.add(panel2, BorderLayout.NORTH);
		panel2.setPreferredSize(new Dimension(350, 100));
		panel2.add(insetsPanel2, BorderLayout.CENTER);
		panel2.add(insetsPanel3, BorderLayout.EAST);

		this.setTitle("About XEAD Modeler");
		this.getContentPane().add(panel1, null);
		this.setResizable(false);
	}

	protected void processWindowEvent(WindowEvent e) {
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			cancel();
		}
		super.processWindowEvent(e);
	}

	void cancel() {
		dispose();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			cancel();
		}
	}

	void labelURL_mouseClicked(MouseEvent e) {
		try {
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			desktop.browse(new URI(URL_DBC));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "The Site is inaccessible.");
		} finally {
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}

	void labelURL_mouseEntered(MouseEvent e) {
		setCursor(htmlEditorKit.getLinkCursor());
	}

	void labelURL_mouseExited(MouseEvent e) {
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
}

class DialogAbout_labelURL_mouseAdapter extends java.awt.event.MouseAdapter {
	DialogAbout adaptee;
	DialogAbout_labelURL_mouseAdapter(DialogAbout adaptee) {
		this.adaptee = adaptee;
	}
	public void mouseClicked(MouseEvent e) {
		adaptee.labelURL_mouseClicked(e);
	}
	public void mouseEntered(MouseEvent e) {
		adaptee.labelURL_mouseEntered(e);
	}
	public void mouseExited(MouseEvent e) {
		adaptee.labelURL_mouseExited(e);
	}
}