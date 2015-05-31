package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Interrupt Return
// Category: general/breakstack

trait IRETD extends InstructionDefinition {
  val mnemonic = "IRETD"
}

object IRETD extends ZeroOperands[IRETD] with IRETDImpl

trait IRETDImpl extends IRETD {
  implicit object IRETD_0 extends _0 {
    val opcode: OneOpcode = 0xCF
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
