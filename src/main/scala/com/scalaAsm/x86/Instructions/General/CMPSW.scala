package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPSW extends InstructionDefinition {
  val mnemonic = "CMPSW"
}

object CMPSW extends ZeroOperands[CMPSW] with CMPSWImpl

trait CMPSWImpl extends CMPSW {
  implicit object CMPSW_0 extends _0 {
    val opcode: OneOpcode = 0xA7
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
